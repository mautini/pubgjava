import com.mautini.pubgjava.api.PubgClient;
import com.mautini.pubgjava.exception.PubgClientException;
import com.mautini.pubgjava.model.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class PubgClientTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PubgClientTest.class);

    public static void main(String[] args) throws PubgClientException {
        PubgClient pubgClient = new PubgClient();
        List<Player> playerList = pubgClient.getPlayersByNames("pc-eu", "nbatteur");
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

        playerList = pubgClient.getPlayersByIds("pc-eu", "account.d62f19aa5fc543339d1e98be0b35bbf3");
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

        Player player = pubgClient.getPlayer("pc-eu", "account.d62f19aa5fc543339d1e98be0b35bbf3");
        LOGGER.info(player.getPlayerAttributes().getName());
    }
}
