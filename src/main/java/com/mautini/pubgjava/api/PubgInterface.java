package com.mautini.pubgjava.api;

import com.mautini.pubgjava.model.Player;
import com.mautini.pubgjava.model.generic.DataHolder;
import com.mautini.pubgjava.model.generic.DataListHolder;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PubgInterface {

    String BASE_URL = "https://api.playbattlegrounds.com";

    @GET("/shards/{shard}/players")
    Call<DataListHolder<Player>> getPlayersByNames(@Path("shard") String shard,
                                                   @Query("filter[playerNames]") String playerNames);

    @GET("/shards/{shard}/players")
    Call<DataListHolder<Player>> getPlayersByIds(@Path("shard") String shard,
                                                 @Query("filter[playerIds]") String playerIds);

    @GET("/shards/{shard}/players/{id}")
    Call<DataHolder<Player>> getPlayer(@Path("shard") String shard, @Path("id") String id);
}
