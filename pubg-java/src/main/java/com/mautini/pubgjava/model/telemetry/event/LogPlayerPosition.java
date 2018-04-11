package com.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogPlayerPosition extends TelemetryEventCharacter {

    @SerializedName(value = "elapsedTime", alternate = "ElapsedTime")
    private Float elapsedTime;

    @SerializedName(value = "numAlivePlayers", alternate = "NumAlivePlayers")
    private Integer numAlivePlayers;

    public LogPlayerPosition() {
        super();
    }

    public Float getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Float elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getNumAlivePlayers() {
        return numAlivePlayers;
    }

    public void setNumAlivePlayers(Integer numAlivePlayers) {
        this.numAlivePlayers = numAlivePlayers;
    }
}
