package com.github.mautini.pubgjava;

import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.asset.Asset;
import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.generic.Entity;
import com.github.mautini.pubgjava.model.match.Match;
import com.github.mautini.pubgjava.model.match.MatchRelationships;
import com.github.mautini.pubgjava.model.match.MatchResponse;
import com.github.mautini.pubgjava.model.participant.Participant;
import com.github.mautini.pubgjava.model.roster.Roster;
import com.github.mautini.pubgjava.util.CollectionsUtil;

import java.util.List;
import java.util.stream.Collectors;

public class MatchResponseUtils {

    private final MatchResponse matchResponse;

    public MatchResponseUtils(MatchResponse matchResponse) throws PubgClientException {
        if (matchResponse == null) {
            throw new PubgClientException("The match cannot be null");
        }

        this.matchResponse = matchResponse;
    }

    /**
     * Get the participants of the match
     *
     * @return the list of participant
     * @throws PubgClientException if we can't get the participants
     */
    public List<Participant> getParticipants() throws PubgClientException {
        return MatchResponseUtils.getParticipants(matchResponse);
    }

    /**
     * Get the rosters of the match
     *
     * @return the list of rosters
     * @throws PubgClientException if we can't get the rosters
     */
    public List<Roster> getRosters() throws PubgClientException {
        return MatchResponseUtils.getRosters(matchResponse);
    }

    /**
     * Get the roster which win the match
     *
     * @return the winning roster
     * @throws PubgClientException if we can't find the winner
     */
    public Roster getWinner() throws PubgClientException {
        return MatchResponseUtils.getWinner(matchResponse);
    }

    /**
     * Return the list of winners for this match
     *
     * @return the winners (all the players of the winning roaster
     * @throws PubgClientException if we can't get the winners
     */
    public List<Participant> getWinners() throws PubgClientException {
        return MatchResponseUtils.getWinners(matchResponse);
    }

    public String getTelemetryUrl() throws PubgClientException {
        return MatchResponseUtils.getTelemetryUrl(matchResponse);
    }

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

    public static Roster getWinner(MatchResponse matchResponse) throws PubgClientException {
        List<Roster> rosters = MatchResponseUtils.getRosters(matchResponse);
        return rosters.stream()
                .filter(roster -> roster.getRosterAttributes() != null)
                .filter(roster -> Boolean.TRUE.equals(roster.getRosterAttributes().getWon()))
                .findFirst()
                .orElseThrow(() -> new PubgClientException("Unable to get the winner of the match"));
    }

    public static List<Participant> getParticipants(MatchResponse matchResponse) throws PubgClientException {
        if (matchResponse.getIncluded() == null) {
            throw new PubgClientException("No content in this match");
        }

        return CollectionsUtil.filterType(matchResponse.getIncluded(), Participant.class);
    }

    public static List<Roster> getRosters(MatchResponse matchResponse) throws PubgClientException {
        if (matchResponse.getIncluded() == null) {
            throw new PubgClientException("No content in this match");
        }

        return CollectionsUtil.filterType(matchResponse.getIncluded(), Roster.class);
    }

    public static List<Participant> getWinners(MatchResponse matchResponse) throws PubgClientException {
        List<String> participantsIds = RosterUtils.getParticipantsIds(MatchResponseUtils.getWinner(matchResponse));


        return MatchResponseUtils.getParticipants(matchResponse).stream()
                .filter(participant -> participantsIds.contains(participant.getId()))
                .collect(Collectors.toList());
    }
}
