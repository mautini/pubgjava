package com.github.mautini.pubgjava.api;

import com.github.mautini.pubgjava.model.telemetry.event.TelemetryEvent;
import com.github.mautini.pubgjava.util.RetrofitUtil;
import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.Shard;
import com.github.mautini.pubgjava.model.generic.DataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataListHolder;
import com.github.mautini.pubgjava.model.match.MatchResponse;
import com.github.mautini.pubgjava.model.player.Player;
import com.github.mautini.pubgjava.model.status.Status;
import com.github.mautini.pubgjava.model.telemetry.Telemetry;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PubgClientAsync extends AbstractPubgClient {

    public PubgClientAsync() {
        super();
    }

    /**
     * Get the list of players matching the playerNames in the provided shard
     */
    public void getPlayersByNames(ResponseCallback<ResponseDataListHolder<Player>> responseCallback,
                                  Shard shard, String... playersNames) {

        String players = Arrays.stream(playersNames).collect(Collectors.joining(","));
        RetrofitUtil.getResponseAsync(pubgInterface.getPlayersByNames(shard.toString(), players), responseCallback);
    }

    /**
     * Get the list of players matching the playerIds in the provided shard
     */
    public void getPlayersByIds(ResponseCallback<ResponseDataListHolder<Player>> responseCallback,
                                Shard shard, String... playerIds) {

        String players = Arrays.stream(playerIds).collect(Collectors.joining(","));
        RetrofitUtil.getResponseAsync(pubgInterface.getPlayersByIds(shard.toString(), players), responseCallback);
    }

    /**
     * Get a player given its Id and shard
     */
    public void getPlayer(ResponseCallback<ResponseDataHolder<Player>> responseCallback, Shard shard, String id) {
        RetrofitUtil.getResponseAsync(pubgInterface.getPlayer(shard.toString(), id), responseCallback);
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
     * Get a match given its Id and shard
     */
    public void getMatch(ResponseCallback<MatchResponse> responseResponseCallback, Shard shard, String id) {
        RetrofitUtil.getResponseAsync(pubgInterface.getMatch(shard.toString(), id), responseResponseCallback);
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
}
