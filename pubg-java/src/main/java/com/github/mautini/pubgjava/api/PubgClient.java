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

public class PubgClient extends AbstractPubgClient {

    public PubgClient() {
        super();
    }

    /**
     * Get the list of players matching the playerNames in the provided platformRegion
     */
    public ResponseDataListHolder<Player> getPlayersByNames(PlatformRegion platformRegion, String... playersNames)
            throws PubgClientException {

        String players = String.join(",", playersNames);

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByNames(platformRegion.toString(), players));
    }

    /**
     * Get the list of players matching the playerIds in the provided platformRegion
     */
    public ResponseDataListHolder<Player> getPlayersByIds(PlatformRegion platformRegion, String... playerIds)
            throws PubgClientException {

        String players = String.join(",", playerIds);

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByIds(platformRegion.toString(), players));
    }

    /**
     * Get a player given its Id and platformRegion
     */
    public ResponseDataHolder<Player> getPlayer(PlatformRegion platformRegion, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getPlayer(platformRegion.toString(), id));
    }

    /**
     * Return the status of the API
     */
    public Status getStatus() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getStatus()).getData();
    }

    /**
     * Get a match given its Id and platformRegion
     */
    public MatchResponse getMatch(PlatformRegion platformRegion, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getMatch(platformRegion.toString(), id));
    }

    /**
     * Get the telemetry from the provided link
     */
    public Telemetry getTelemetry(String link) throws PubgClientException {
        List<TelemetryEvent> telemetryEvents = RetrofitUtil.getResponse(pubgInterface.getTelemetry(link));

        return new Telemetry(telemetryEvents);
    }

    /**
     * Get a list of sample matches.
     * A starting search date (in UTC) can be provided. If it's set to null, the default time now() is used.
     * Note that the date must be 24 hours prior to now, otherwise you will get an error.
     */
    public DataHolder<Sample> getSamples(PlatformRegion platformRegion, Instant createdAtStart)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getSamples(platformRegion.toString(), createdAtStart));
    }

    /**
     * Get a list of available seasons.
     */
    public ResponseDataListHolder<Season> getSeasons(PlatformRegion platformRegion) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasons(platformRegion.toString()));
    }

    /**
     * Get a list of available seasons.
     */
    public ResponseDataListHolder<Season> getSeasons(Platform platform) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasons(platform.toString()));
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
     * After this date, use {@link #getPlayerSeason(Platform, String, String)}
     */
    public ResponseDataHolder<PlayerSeason> getPlayerSeason(PlatformRegion platformRegion, String playerId,
                                                            String seasonId) throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getPlayerSeason(platformRegion.toString(), playerId, seasonId));
    }

    /**
     * Get season information for a single player.
     * This method must be used for PC seasons after 18/10/03.
     * Before this date, use {@link #getPlayerSeason(PlatformRegion, String, String)}
     */
    public ResponseDataHolder<PlayerSeason> getPlayerSeason(Platform platform, String playerId,
                                                            String seasonId) throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getPlayerSeason(platform.toString(), playerId, seasonId));
    }

    /**
     * Get list of tournaments
     */
    public ResponseDataListHolder<Tournament> getTournaments() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getTournaments());
    }

    /**
     * Get a tournament by id
     */
    public ResponseDataHolder<Tournament> getTournament(String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getTournament(id));
    }
}
