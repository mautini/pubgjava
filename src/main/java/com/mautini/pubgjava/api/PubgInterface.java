package com.mautini.pubgjava.api;

import com.mautini.pubgjava.model.generic.MultipleEntityResponse;
import com.mautini.pubgjava.model.generic.SingleEntityResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PubgInterface {

    String BASE_URL = "https://api.playbattlegrounds.com";

    @GET("/shards/{shard}/players")
    Call<MultipleEntityResponse> getPlayersByNames(@Path("shard") String shard,
                                                   @Query("filter[playerNames]") String playerNames);

    @GET("/shards/{shard}/players")
    Call<MultipleEntityResponse> getPlayersByIds(@Path("shard") String shard,
                                                 @Query("filter[playerIds]") String playerIds);

    @GET("/shards/{shard}/players/{id}")
    Call<SingleEntityResponse> getPlayer(@Path("shard") String shard, @Path("id") String id);
}