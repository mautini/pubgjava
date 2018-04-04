package com.mautini.pubgjava.api;

import com.mautini.pubgjava.model.generic.DataHolder;
import com.mautini.pubgjava.model.generic.DataListHolder;
import com.mautini.pubgjava.model.match.Match;
import com.mautini.pubgjava.model.player.Player;
import com.mautini.pubgjava.model.status.Status;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PubgInterface {

    String BASE_URL = "https://api.playbattlegrounds.com";

    @Headers("@: Auth")
    @GET("/shards/{shard}/players")
    Call<DataListHolder<Player>> getPlayersByNames(@Path("shard") String shard,
                                                   @Query("filter[playerNames]") String playerNames);

    @Headers("@: Auth")
    @GET("/shards/{shard}/players")
    Call<DataListHolder<Player>> getPlayersByIds(@Path("shard") String shard,
                                                 @Query("filter[playerIds]") String playerIds);

    @Headers("@: Auth")
    @GET("/shards/{shard}/players/{id}")
    Call<DataHolder<Player>> getPlayer(@Path("shard") String shard, @Path("id") String id);

    @GET("/status")
    Call<DataHolder<Status>> getStatus();

    @Headers("@: Auth")
    @GET("/shards/{shard}/matches/{id}")
    Call<DataHolder<Match>> getMatch(@Path("shard") String shard, @Path("id") String id);
}
