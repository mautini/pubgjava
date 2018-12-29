package com.github.mautini.pubgjava.model.leaderboard;

import com.github.mautini.pubgjava.model.GameMode;

public class LeaderboardAttributes {

    private String shardId;

    private GameMode gameMode;

    public LeaderboardAttributes() {
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }
}
