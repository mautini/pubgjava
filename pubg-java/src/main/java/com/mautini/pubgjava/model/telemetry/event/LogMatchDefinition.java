package com.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogMatchDefinition extends TelemetryEvent {

    @SerializedName(value = "matchId", alternate = "MatchId")
    private String matchId;

    @SerializedName(value = "pingQuality", alternate = "PingQuality")
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
