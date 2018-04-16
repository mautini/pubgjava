package com.github.mautini.pubgjava;

import com.github.mautini.pubgjava.api.PubgClient;
import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.Shard;
import com.github.mautini.pubgjava.model.match.MatchResponse;
import com.github.mautini.pubgjava.model.participant.Participant;
import com.github.mautini.pubgjava.model.player.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PubgClientSample {

    private static final Logger LOGGER = LoggerFactory.getLogger(PubgClientSample.class);

    public static void main(String[] args) throws PubgClientException {
        PubgClient pubgClient = new PubgClient();

        List<Player> playerList = pubgClient.getPlayersByNames(Shard.PC_EU, "nbatteur").getData();
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

        PlayerUtils playerUtils = new PlayerUtils(playerList.get(0));
        List<String> matchs = playerUtils.getMatchsIds();
        for (String match : matchs) {
            try {
                MatchResponse matchResponse = pubgClient.getMatch(Shard.PC_EU, match);
                MatchResponseUtils matchResponseUtils = new MatchResponseUtils(matchResponse);
                List<Participant> winners = matchResponseUtils.getWinners();
                winners.forEach(participant -> LOGGER.info(participant.getParticipantAttributes().getParticipantStats().getName()));
            } catch (PubgClientException exception) {
                LOGGER.error("", exception);
            }
        }
    }
}
