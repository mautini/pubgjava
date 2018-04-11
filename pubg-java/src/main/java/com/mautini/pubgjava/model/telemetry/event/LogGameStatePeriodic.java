package com.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.telemetry.object.GameState;

public class LogGameStatePeriodic extends TelemetryEvent {

    @SerializedName(value = "gameState", alternate = "GameState")
    private GameState gameState;

    public LogGameStatePeriodic() {
        super();
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }
}
