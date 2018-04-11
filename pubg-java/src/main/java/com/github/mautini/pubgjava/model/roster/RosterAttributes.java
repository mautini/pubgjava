package com.github.mautini.pubgjava.model.roster;

import com.google.gson.annotations.SerializedName;

public class RosterAttributes {

    private String shardId;

    @SerializedName("stats")
    private RosterStats rosterStats;

    private Boolean won;

    public RosterAttributes() {
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public RosterStats getRosterStats() {
        return rosterStats;
    }

    public void setRosterStats(RosterStats rosterStats) {
        this.rosterStats = rosterStats;
    }

    public Boolean getWon() {
        return won;
    }

    public void setWon(Boolean won) {
        this.won = won;
    }
}