package com.mautini.pubgjava.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mautini.pubgjava.exception.PubgClientException;
import com.mautini.pubgjava.model.Shard;
import com.mautini.pubgjava.model.asset.Asset;
import com.mautini.pubgjava.model.generic.Entity;
import com.mautini.pubgjava.model.generic.response.ResponseDataHolder;
import com.mautini.pubgjava.model.generic.response.ResponseDataListHolder;
import com.mautini.pubgjava.model.match.Match;
import com.mautini.pubgjava.model.match.MatchResponse;
import com.mautini.pubgjava.model.participant.Participant;
import com.mautini.pubgjava.model.player.Player;
import com.mautini.pubgjava.model.roster.Roster;
import com.mautini.pubgjava.model.status.Status;
import com.mautini.pubgjava.util.RetrofitUtil;
import com.typesafe.config.ConfigFactory;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PubgClient {

    private static final Logger LOGGER = LoggerFactory.getLogger(PubgClient.class);

    private static final String ACCEPT_HEADER = "application/vnd.api+json";

    private PubgInterface pubgInterface;

    /**
     * Create a new PUBG Client
     */
    public PubgClient() {
        String apiKey = ConfigFactory.load().getString("apiKey");

        // Create a custom OkHttpClient to add the headers for all the requests
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(
                        chain -> {
                            Request request = chain.request();

                            Request.Builder builder = request.newBuilder()
                                    .addHeader("Accept", ACCEPT_HEADER);

                            // Get all the custom header (using the @ annotation)
                            List<String> customAnnotations = chain.request().headers().values("@");
                            if (customAnnotations.contains("Auth")) {
                                builder.addHeader("Authorization", "Bearer " + apiKey);
                            }
                            builder.removeHeader("@");

                            return chain.proceed(builder.build());
                        }).build();


        // Create a new Gson object and register an adapter for the ZonedDateTime type
        Gson gson = new GsonBuilder()
                .registerTypeAdapter(ZonedDateTime.class, new TypeAdapter<ZonedDateTime>() {
                    @Override
                    public void write(JsonWriter out, ZonedDateTime value) throws IOException {
                        out.value(value.toString());
                    }

                    @Override
                    public ZonedDateTime read(JsonReader in) throws IOException {
                        return ZonedDateTime.parse(in.nextString());
                    }
                })
                .registerTypeAdapter(Entity.class, (JsonDeserializer<Entity>) (json, typeOfT, context) -> {
                    JsonObject jsonObject = json.getAsJsonObject();

                    JsonElement jsonType = jsonObject.get("type");
                    String type = jsonType.getAsString();

                    switch (type) {
                        case "player":
                            return context.deserialize(json, Player.class);
                        case "match":
                            return context.deserialize(json, Match.class);
                        case "status":
                            return context.deserialize(json, Status.class);
                        case "roster":
                            return context.deserialize(json, Roster.class);
                        case "participant":
                            return context.deserialize(json, Participant.class);
                        case "asset":
                            return context.deserialize(json, Asset.class);
                        default:
                            return null;
                    }
                })
                .create();

        // Build the interface to the API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PubgInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();

        pubgInterface = retrofit.create(PubgInterface.class);
    }

    /**
     * Get the list of players matching the playerNames in the provided shard
     */
    public ResponseDataListHolder<Player> getPlayersByNames(Shard shard, String... playersNames)
            throws PubgClientException {

        String players = Arrays.stream(playersNames).collect(Collectors.joining(","));

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByNames(shard.toString(), players));
    }

    /**
     * Get the list of players matching the playerIds in the provided shard
     */
    public ResponseDataListHolder<Player> getPlayersByIds(Shard shard, String... playerIds) throws PubgClientException {
        String players = Arrays.stream(playerIds).collect(Collectors.joining(","));

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByIds(shard.toString(), players));
    }

    /**
     * Get a player given its Id and shard
     */
    public ResponseDataHolder<Player> getPlayer(Shard shard, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getPlayer(shard.toString(), id));
    }

    /**
     * Return the status of the API
     */
    public Status getStatus() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getStatus()).getData();
    }

    /**
     * Get a match given its Id and shard
     */
    public MatchResponse getMatch(Shard shard, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getMatch(shard.toString(), id));
    }
}
