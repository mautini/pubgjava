package com.github.mautini.pubgjava.api;

import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.Platform;
import com.github.mautini.pubgjava.model.PlatformRegion;
import com.github.mautini.pubgjava.model.generic.DataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataListHolder;
import com.github.mautini.pubgjava.model.match.MatchResponse;
import com.github.mautini.pubgjava.model.player.Player;
import com.github.mautini.pubgjava.model.playerseason.PlayerSeason;
import com.github.mautini.pubgjava.model.sample.Sample;
import com.github.mautini.pubgjava.model.season.Season;
import com.github.mautini.pubgjava.model.status.Status;
import com.github.mautini.pubgjava.model.telemetry.Telemetry;
import com.github.mautini.pubgjava.model.telemetry.event.TelemetryEvent;
import com.github.mautini.pubgjava.model.tournament.Tournament;
import com.github.mautini.pubgjava.util.RetrofitUtil;

import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PubgClientAsync extends AbstractPubgClient {

    public PubgClientAsync() {
        super();
    }

    /**
     * Get the list of players matching the playerNames in the provided platformRegion
     */
    public void getPlayersByNames(ResponseCallback<ResponseDataListHolder<Player>> responseCallback,
                                  PlatformRegion platformRegion, String... playersNames) {

        String players = String.join(",", playersNames);
        RetrofitUtil.getResponseAsync(
                pubgInterface.getPlayersByNames(platformRegion.toString(), players), responseCallback
        );
    }

    /**
     * Get the list of players matching the playerIds in the provided platformRegion
     */
    public void getPlayersByIds(ResponseCallback<ResponseDataListHolder<Player>> responseCallback,
                                PlatformRegion platformRegion, String... playerIds) {

        String players = String.join(",", playerIds);
        RetrofitUtil.getResponseAsync(pubgInterface.getPlayersByIds(
                platformRegion.toString(), players), responseCallback
        );
    }

    /**
     * Get a player given its Id and platformRegion
     */
    public void getPlayer(ResponseCallback<ResponseDataHolder<Player>> responseCallback, PlatformRegion platformRegion,
                          String id) {

        RetrofitUtil.getResponseAsync(pubgInterface.getPlayer(platformRegion.toString(), id), responseCallback);
    }

    /**
     * Return the status of the API
     */
    public void getStatus(ResponseCallback<Status> responseCallback) {
        // Wrap the callback in another one to return the status (not the DataHolder<Status>)
        ResponseCallback<DataHolder<Status>> callbackWrapper = new ResponseCallback<DataHolder<Status>>() {
            @Override
            public void onResponse(DataHolder<Status> statusDataHolder) {
                responseCallback.onResponse(statusDataHolder.getData());
            }

            @Override
            public void onError(PubgClientException pubgClientException) {
                responseCallback.onError(pubgClientException);
            }
        };

        RetrofitUtil.getResponseAsync(pubgInterface.getStatus(), callbackWrapper);
    }

    /**
     * Get a match given its Id and platformRegion
     */
    public void getMatch(ResponseCallback<MatchResponse> responseResponseCallback, PlatformRegion platformRegion,
                         String id) {

        RetrofitUtil.getResponseAsync(pubgInterface.getMatch(platformRegion.toString(), id), responseResponseCallback);
    }

    /**
     * Get the telemetry from the provided link
     */
    public void getTelemetry(ResponseCallback<Telemetry> responseCallback, String link) {
        ResponseCallback<List<TelemetryEvent>> callbackWrapper = new ResponseCallback<List<TelemetryEvent>>() {
            @Override
            public void onResponse(List<TelemetryEvent> telemetryEvents) {
                responseCallback.onResponse(new Telemetry(telemetryEvents));
            }

            @Override
            public void onError(PubgClientException pubgClientException) {
                responseCallback.onError(pubgClientException);
            }
        };

        RetrofitUtil.getResponseAsync(pubgInterface.getTelemetry(link), callbackWrapper);
    }

    /**
     * Get a list of sample matches
     * A starting search date (in UTC) can be provided. If it's set to null, the default time now() is used.
     * Note that the date must be 24 hours prior to now, otherwise you will get an error.
     */
    public void getSamples(ResponseCallback<DataHolder<Sample>> responseCallback, PlatformRegion platformRegion,
                           Instant createdAtStart) {

        RetrofitUtil.getResponseAsync(
                pubgInterface.getSamples(platformRegion.toString(), createdAtStart), responseCallback
        );
    }

    /**
     * Get a list of available seasons
     */
    public void getSeasons(ResponseCallback<ResponseDataListHolder<Season>> responseCallback,
                           PlatformRegion platformRegion) {

        RetrofitUtil.getResponseAsync(pubgInterface.getSeasons(platformRegion.toString()), responseCallback);
    }

    /**
     * Get a list of available seasons
     */
    public void getSeasons(ResponseCallback<ResponseDataListHolder<Season>> responseCallback,
                           Platform platform) {

        RetrofitUtil.getResponseAsync(pubgInterface.getSeasons(platform.toString()), responseCallback);
    }

    /**
     * Get lifetime stats (as of division.bro.official.pc-2018-01) for a single player (PC only)
     */
    public void getPlayerLifetimeStats(ResponseCallback<ResponseDataHolder<PlayerSeason>> responseCallback,
                                Platform platform, String playerId) {

        RetrofitUtil.getResponseAsync(
                pubgInterface.getPlayerSeason(platform.toString(), playerId, LIFETIME_STATS), responseCallback
        );
    }

    /**
     * Get season information for a single player.
     * This method must be used for Xbox or PC seasons before 18/10/03.
     * After this date, use {@link #getPlayerSeason(ResponseCallback, Platform, String, String)}
     */
    public void getPlayerSeason(ResponseCallback<ResponseDataHolder<PlayerSeason>> responseCallback,
                                PlatformRegion platformRegion, String playerId, String seasonId) {

        RetrofitUtil.getResponseAsync(
                pubgInterface.getPlayerSeason(platformRegion.toString(), playerId, seasonId), responseCallback
        );
    }

    /**
     * Get season information for a single player.
     * This method must be used for PC seasons after 18/10/03.
     * Before this date, use {@link #getPlayerSeason(ResponseCallback, PlatformRegion, String, String)}
     */
    public void getPlayerSeason(ResponseCallback<ResponseDataHolder<PlayerSeason>> responseCallback,
                                Platform platform, String playerId, String seasonId) {

        RetrofitUtil.getResponseAsync(
                pubgInterface.getPlayerSeason(platform.toString(), playerId, seasonId), responseCallback
        );
    }

    /**
     * Get list of tournaments
     */
    public void getTournaments(ResponseCallback<ResponseDataListHolder<Tournament>> responseCallback) {
        RetrofitUtil.getResponseAsync(pubgInterface.getTournaments(), responseCallback);
    }

    /**
     * Get a tournament by id
     */
    public void getTournament(ResponseCallback<ResponseDataHolder<Tournament>> responseCallback, String id) {
        RetrofitUtil.getResponseAsync(pubgInterface.getTournament(id), responseCallback);
    }
}
