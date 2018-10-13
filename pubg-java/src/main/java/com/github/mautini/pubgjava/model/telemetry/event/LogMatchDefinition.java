package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.SeasonState;
import com.google.gson.annotations.SerializedName;

public class LogMatchDefinition extends TelemetryEvent {

    @SerializedName("MatchId")
    private String matchId;

    @SerializedName("PingQuality")
    private String pingQuality;

    @SerializedName("SeasonState")
    private SeasonState seasonState;

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

    public SeasonState getSeasonState() {
        return seasonState;
    }

    public void setSeasonState(SeasonState seasonState) {
        this.seasonState = seasonState;
    }
}
