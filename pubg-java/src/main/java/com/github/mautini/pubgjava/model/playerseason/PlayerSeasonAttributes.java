package com.github.mautini.pubgjava.model.playerseason;

import com.google.gson.annotations.SerializedName;

public class PlayerSeasonAttributes {

    @SerializedName("gameModeStats")
    private GameModeStatsWrapper gameModeStatsWrapper;

    public PlayerSeasonAttributes() {
    }

    public GameModeStatsWrapper getGameModeStatsWrapper() {
        return gameModeStatsWrapper;
    }

    public void setGameModeStatsWrapper(GameModeStatsWrapper gameModeStatsWrapper) {
        this.gameModeStatsWrapper = gameModeStatsWrapper;
    }
}
