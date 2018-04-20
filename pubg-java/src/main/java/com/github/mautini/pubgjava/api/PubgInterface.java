package com.github.mautini.pubgjava.api;

import com.github.mautini.pubgjava.model.generic.DataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataListHolder;
import com.github.mautini.pubgjava.model.match.MatchResponse;
import com.github.mautini.pubgjava.model.player.Player;
import com.github.mautini.pubgjava.model.sample.Sample;
import com.github.mautini.pubgjava.model.status.Status;
import com.github.mautini.pubgjava.model.telemetry.event.TelemetryEvent;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

import java.time.Instant;
import java.util.List;

public interface PubgInterface {

    String BASE_URL = "https://api.playbattlegrounds.com";

    @Headers("@: Auth")
    @GET("/shards/{shard}/players")
    Call<ResponseDataListHolder<Player>> getPlayersByNames(@Path("shard") String shard,
                                                           @Query("filter[playerNames]") String playerNames);

    @Headers("@: Auth")
    @GET("/shards/{shard}/players")
    Call<ResponseDataListHolder<Player>> getPlayersByIds(@Path("shard") String shard,
                                                         @Query("filter[playerIds]") String playerIds);

    @Headers("@: Auth")
    @GET("/shards/{shard}/players/{id}")
    Call<ResponseDataHolder<Player>> getPlayer(@Path("shard") String shard, @Path("id") String id);

    @GET("/status")
    Call<DataHolder<Status>> getStatus();

    @Headers("@: Auth")
    @GET("/shards/{shard}/matches/{id}")
    Call<MatchResponse> getMatch(@Path("shard") String shard, @Path("id") String id);

    @Headers("@: Auth")
    @GET("/shards/{shard}/samples")
    Call<DataHolder<Sample>> getSamples(@Path("shard") String shard,
                                        @Query("filter[createdAt-start]") Instant createdAtStart);

    @GET
    Call<List<TelemetryEvent>> getTelemetry(@Url String url);
}
