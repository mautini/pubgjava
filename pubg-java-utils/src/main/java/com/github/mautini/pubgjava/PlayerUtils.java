package com.github.mautini.pubgjava;

import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.generic.Entity;
import com.github.mautini.pubgjava.model.match.Match;
import com.github.mautini.pubgjava.model.player.Player;
import com.github.mautini.pubgjava.model.player.PlayerRelationships;

import java.util.List;
import java.util.stream.Collectors;

public class PlayerUtils {

    private Player player;

    public PlayerUtils(Player player) throws PubgClientException {
        if (player == null) {
            throw new PubgClientException("The player cannot be null");
        }

        this.player = player;
    }

    public List<String> getMatchsIds() throws PubgClientException {
        return PlayerUtils.getMatchsIds(player);
    }

    public static List<String> getMatchsIds(Player player) throws PubgClientException {
        PlayerRelationships playerRelationships = player.getPlayerRelationships();

        if (playerRelationships == null) {
            throw new PubgClientException("Unable to get the relationships of the player");
        }

        DataListHolder<Match> matchs = playerRelationships.getMatches();
        if (matchs == null || matchs.getData() == null) {
            throw new PubgClientException("Unable to get the matchs of the player");
        }

        return matchs.getData().stream()
                .map(Entity::getId)
                .collect(Collectors.toList());
    }
}
