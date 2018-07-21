package com.github.mautini.pubgjava.api;

import com.github.mautini.pubgjava.model.generic.DataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataListHolder;
import com.github.mautini.pubgjava.model.match.MatchResponse;
import com.github.mautini.pubgjava.model.player.Player;
import com.github.mautini.pubgjava.model.playerseason.PlayerSeason;
import com.github.mautini.pubgjava.model.sample.Sample;
import com.github.mautini.pubgjava.model.season.Season;
import com.github.mautini.pubgjava.model.status.Status;
import com.github.mautini.pubgjava.model.telemetry.event.TelemetryEvent;
import com.github.mautini.pubgjava.model.tournament.Tournament;
import retrofit2.Call;
import retrofit2.http.*;

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

    @Headers("@: Auth")
    @GET("/shards/{shard}/players/{id}/seasons/{seasonId}")
    Call<ResponseDataHolder<PlayerSeason>> getPlayerSeason(@Path("shard") String shard, @Path("id") String playerId,
                                                           @Path("seasonId") String seasonId);

    @GET("/status")
    Call<DataHolder<Status>> getStatus();

    @Headers("@: Auth")
    @GET("/shards/{shard}/matches/{id}")
    Call<MatchResponse> getMatch(@Path("shard") String shard, @Path("id") String id);

    @Headers("@: Auth")
    @GET("/shards/{shard}/samples")
    Call<DataHolder<Sample>> getSamples(@Path("shard") String shard,
                                        @Query("filter[createdAt-start]") Instant createdAtStart);

    @Headers("@: Auth")
    @GET("/shards/{shard}/seasons")
    Call<ResponseDataListHolder<Season>> getSeasons(@Path("shard") String shard);

    @Headers("@: Auth")
    @GET("/tournaments")
    Call<ResponseDataListHolder<Tournament>> getTournaments();

    @Headers("@: Auth")
    @GET("/tournaments/{id}")
    Call<ResponseDataHolder<Tournament>> getTournament(@Path("id") String id);

    @GET
    Call<List<TelemetryEvent>> getTelemetry(@Url String url);
}
