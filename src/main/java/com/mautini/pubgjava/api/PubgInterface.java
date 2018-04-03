package com.mautini.pubgjava.api;

import com.mautini.pubgjava.model.PlayerResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface PubgInterface {

    String BASE_URL = "https://api.playbattlegrounds.com";

    @GET("/shards/{shard}/players")
    Call<PlayerResponse> getPlayers(@Path("shard") String shard, @Query("filter[playerNames]") String playerNames);
}
