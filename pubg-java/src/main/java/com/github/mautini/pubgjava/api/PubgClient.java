package com.github.mautini.pubgjava.api;

import com.github.mautini.pubgjava.model.telemetry.event.TelemetryEvent;
import com.github.mautini.pubgjava.util.RetrofitUtil;
import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.Shard;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataListHolder;
import com.github.mautini.pubgjava.model.match.MatchResponse;
import com.github.mautini.pubgjava.model.player.Player;
import com.github.mautini.pubgjava.model.status.Status;
import com.github.mautini.pubgjava.model.telemetry.Telemetry;
import com.github.mautini.pubgjava.model.telemetry.event.TelemetryEvent;
import com.github.mautini.pubgjava.util.RetrofitUtil;

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
     * Get the telemetry from a match
     */
    public Telemetry getTelemetry(MatchResponse matchResponse) throws PubgClientException {
        return getTelemetry(PubgClientUtil.getTelemetryUrl(matchResponse));
    }
}
