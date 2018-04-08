package com.mautini.pubgjava.api;

import com.mautini.pubgjava.model.generic.DataHolder;
import com.mautini.pubgjava.model.generic.response.ResponseDataHolder;
import com.mautini.pubgjava.model.generic.response.ResponseDataListHolder;
import com.mautini.pubgjava.model.match.MatchResponse;
import com.mautini.pubgjava.model.player.Player;
import com.mautini.pubgjava.model.status.Status;
import com.mautini.pubgjava.model.telemetry.event.TelemetryEvent;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

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

    @GET
    Call<List<TelemetryEvent>> getTelemetry(@Url String url);
}
