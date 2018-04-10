package com.mautini.pubgjava.api;

import com.mautini.pubgjava.exception.PubgClientException;
import com.mautini.pubgjava.model.asset.Asset;
import com.mautini.pubgjava.model.generic.DataListHolder;
import com.mautini.pubgjava.model.generic.Entity;
import com.mautini.pubgjava.model.match.Match;
import com.mautini.pubgjava.model.match.MatchRelationships;
import com.mautini.pubgjava.model.match.MatchResponse;

import java.util.List;

public class PubgClientUtil {

    /**
     * Get the url of the telemetry file associated with a matchResponse
     *
     * @param matchResponse the matchResponse for which we are looking for telemetry
     * @return the url of the telemetry file
     * @throws PubgClientException if we can't find the url in the matchResponse
     */
    public static String getTelemetryUrl(MatchResponse matchResponse) throws PubgClientException {
        Match match = matchResponse.getData();
        if (match == null) {
            throw new PubgClientException("Match is null in matchResponse");
        }

        MatchRelationships matchRelationships = match.getMatchRelationships();
        if (matchRelationships == null) {
            throw new PubgClientException("Unable to get match relationships");
        }

        DataListHolder<Asset> assetsHolder = matchRelationships.getAssets();
        if (assetsHolder == null) {
            throw new PubgClientException("Unable to get the assets");
        }

        List<Asset> assets = assetsHolder.getData();
        if (assets == null || assets.isEmpty()) {
            throw new PubgClientException("No assets for this match");
        }

        // The asset containing the id of the telemetry asset
        Asset asset = assets.get(0);
        String telemetryAssetId = asset.getId();
        if (telemetryAssetId == null) {
            throw new PubgClientException("The telemetry doesn't have an Id");
        }

        List<Entity> entities = matchResponse.getIncluded();
        if (entities == null || entities.isEmpty()) {
            throw new PubgClientException("Unable to get the entities for this match");
        }

        Asset telemetryAsset = entities.stream()
                .filter(entity -> telemetryAssetId.equals(entity.getId())
                        && entity instanceof Asset)
                .map(Asset.class::cast)
                .findFirst()
                .orElseThrow(() -> new PubgClientException("Unable to get the asset with id " + telemetryAssetId));

        if (telemetryAsset.getAssetAttributes() == null) {
            throw new PubgClientException("No attributes for this asset");
        }

        String url = telemetryAsset.getAssetAttributes().getUrl();

        if (url == null || url.isEmpty()) {
            throw new PubgClientException("No url for this asset");
        }

        return url;
    }
}
