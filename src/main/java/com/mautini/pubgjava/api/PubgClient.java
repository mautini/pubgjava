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
import com.mautini.pubgjava.model.Match;
import com.mautini.pubgjava.model.Player;
import com.mautini.pubgjava.model.generic.DataHolder;
import com.mautini.pubgjava.model.generic.DataListHolder;
import com.mautini.pubgjava.model.generic.Entity;
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

    public PubgClient() {
        String apiKey = ConfigFactory.load().getString("apiKey");

        // Create a custom OkHttpClient to add the headers for all the requests
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(
                        chain -> {
                            Request request = chain.request().newBuilder()
                                    .addHeader("Accept", ACCEPT_HEADER)
                                    .addHeader("Authorization", "Bearer " + apiKey)
                                    .build();
                            return chain.proceed(request);
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

    public List<Player> getPlayersByNames(String shard, String... playersNames) throws PubgClientException {
        String players = Arrays.stream(playersNames).collect(Collectors.joining(","));

        DataListHolder<Player> playersDataListHolder =
                RetrofitUtil.getResponse(pubgInterface.getPlayersByNames(shard, players));

        return playersDataListHolder.getData();
    }

    public List<Player> getPlayersByIds(String shard, String... playerIds) throws PubgClientException {
        String players = Arrays.stream(playerIds).collect(Collectors.joining(","));

        DataListHolder<Player> playersDataListHolder =
                RetrofitUtil.getResponse(pubgInterface.getPlayersByIds(shard, players));

        return playersDataListHolder.getData();
    }

    public Player getPlayer(String shard, String id) throws PubgClientException {
        DataHolder<Player> singleEntityResponse = RetrofitUtil.getResponse(pubgInterface.getPlayer(shard, id));

        return singleEntityResponse.getData();
    }
}
