package com.github.mautini.pubgjava;

import com.github.mautini.pubgjava.api.PubgClient;
import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.Shard;
import com.github.mautini.pubgjava.model.player.Player;
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
