package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogMatchDefinition extends TelemetryEvent {

    @SerializedName("matchId")
    private String matchId;

    @SerializedName("pingQuality")
    private String pingQuality;

    public LogMatchDefinition() {
        super();
    }

    public String getMatchId() {
        return matchId;
    }

    public void setMatchId(String matchId) {
        this.matchId = matchId;
    }

    public String getPingQuality() {
        return pingQuality;
    }

    public void setPingQuality(String pingQuality) {
        this.pingQuality = pingQuality;
    }
}
