package com.github.mautini.pubgjava;

import com.github.mautini.pubgjava.api.PubgClient;
import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.Platform;
import com.github.mautini.pubgjava.model.PlatformRegion;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataHolder;
import com.github.mautini.pubgjava.model.generic.response.ResponseDataListHolder;
import com.github.mautini.pubgjava.model.player.Player;
import com.github.mautini.pubgjava.model.playerseason.PlayerSeason;
import com.github.mautini.pubgjava.model.season.Season;
import com.github.mautini.pubgjava.model.status.Status;
import com.github.mautini.pubgjava.model.tournament.Tournament;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PubgClientSample {

    private static final Logger LOGGER = LoggerFactory.getLogger(PubgClientSample.class);

    public static void main(String[] args) throws PubgClientException {
        PubgClient pubgClient = new PubgClient();

        // Get shroud player
        List<Player> playerList = pubgClient.getPlayersByNames(PlatformRegion.PC_NA, "shroud").getData();
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

        // Get current season
        List<Season> seasonList = pubgClient.getSeasons(PlatformRegion.PC_NA).getData();
        Season currentSeason = SeasonUtils.getCurrentSeason(seasonList);
        LOGGER.info(currentSeason.getId());

        // Get player season
        PlayerSeason playerSeason = pubgClient.getPlayerSeason(
                Platform.STEAM, playerList.get(0).getId(), currentSeason.getId()
        )
                .getData();

        LOGGER.info(
                "Wins : {}",
                playerSeason.getPlayerSeasonAttributes().getGameModeStatsWrapper().getSoloFpp().getWins()
        );

        // Get info about a tournament
        ResponseDataListHolder<Tournament> tournaments = pubgClient.getTournaments();
        String tournamentId = tournaments.getData().get(0).getId();

        LOGGER.info("Tournament : {}", tournamentId);

        ResponseDataHolder<Tournament> tournament = pubgClient.getTournament(tournamentId);
        String firstMatchId = tournament.getData().getTournamentRelationships().getMatches().getData().get(0).getId();

        LOGGER.info("First match id : {}", firstMatchId);

        Status status = pubgClient.getStatus();
        LOGGER.info("Status : Type = {}, ID = {}", status.getType(), status.getId());

        // Get info about rate limit
        LOGGER.info(
                "Rate Limit : Remaining {} of {} (reset at {})",
                pubgClient.getRateLimitRemaining(),
                pubgClient.getRateLimit(),
                pubgClient.getRateLimitReset()
        );
    }
}
