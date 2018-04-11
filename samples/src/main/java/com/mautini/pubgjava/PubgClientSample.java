package com.mautini.pubgjava;

import com.mautini.pubgjava.api.PubgClient;
import com.mautini.pubgjava.exception.PubgClientException;
import com.mautini.pubgjava.model.Shard;
import com.mautini.pubgjava.model.match.MatchResponse;
import com.mautini.pubgjava.model.player.Player;
import com.mautini.pubgjava.model.status.Status;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PubgClientSample {

    private static final Logger LOGGER = LoggerFactory.getLogger(PubgClientSample.class);

    public static void main(String[] args) throws PubgClientException {
        PubgClient pubgClient = new PubgClient();

        List<Player> playerList = pubgClient.getPlayersByNames(Shard.PC_NA, "shroud").getData();
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());
    }
}
