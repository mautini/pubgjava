package com.github.mautini.pubgjava.api;

import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.Shard;
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
     * Get the list of players matching the playerNames in the provided shard
     */
    public ResponseDataListHolder<Player> getPlayersByNames(Shard shard, String... playersNames)
            throws PubgClientException {

        String players = Arrays.stream(playersNames).collect(Collectors.joining(","));

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByNames(shard.toString(), players));
    }

    /**
     * Get the list of players matching the playerIds in the provided shard
     */
    public ResponseDataListHolder<Player> getPlayersByIds(Shard shard, String... playerIds) throws PubgClientException {
        String players = Arrays.stream(playerIds).collect(Collectors.joining(","));

        return RetrofitUtil.getResponse(pubgInterface.getPlayersByIds(shard.toString(), players));
    }

    /**
     * Get a player given its Id and shard
     */
    public ResponseDataHolder<Player> getPlayer(Shard shard, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getPlayer(shard.toString(), id));
    }

    /**
     * Return the status of the API
     */
    public Status getStatus() throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getStatus()).getData();
    }

    /**
     * Get a match given its Id and shard
     */
    public MatchResponse getMatch(Shard shard, String id) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getMatch(shard.toString(), id));
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
    public DataHolder<Sample> getSamples(Shard shard, Instant createdAtStart) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSamples(shard.toString(), createdAtStart));
    }

    /**
     * Get a list of available seasons.
     */
    public ResponseDataListHolder<Season> getSeasons(Shard shard) throws PubgClientException {
        return RetrofitUtil.getResponse(pubgInterface.getSeasons(shard.toString()));
    }

    /**
     * Get season information for a single player.
     */
    public ResponseDataHolder<PlayerSeason> getPlayerSeason(Shard shard, String playerId, String seasonId)
            throws PubgClientException {

        return RetrofitUtil.getResponse(pubgInterface.getPlayerSeason(shard.toString(), playerId, seasonId));
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
