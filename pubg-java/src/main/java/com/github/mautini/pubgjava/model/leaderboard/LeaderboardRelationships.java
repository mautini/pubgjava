package com.github.mautini.pubgjava.model.leaderboard;

import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.player.Player;

public class LeaderboardRelationships {

    private DataListHolder<Player> players;

    public LeaderboardRelationships() {
    }

    public DataListHolder<Player> getPlayers() {
        return players;
    }

    public void setPlayers(DataListHolder<Player> players) {
        this.players = players;
    }
}
