package com.mautini.pubgjava.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.mautini.pubgjava.exception.PubgClientException;
import com.mautini.pubgjava.model.Player;
import com.mautini.pubgjava.model.PlayerResponse;
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
                .create();

        // Build the interface to the API
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(PubgInterface.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .build();

        pubgInterface = retrofit.create(PubgInterface.class);
    }

    public List<Player> getPlayers(String shard, String... players) throws PubgClientException {
        String playersString = Arrays.stream(players).collect(Collectors.joining(","));
        PlayerResponse playerResponse = RetrofitUtil.getResponse(pubgInterface.getPlayers(shard, playersString));

        return playerResponse.getPlayers();
    }
}
