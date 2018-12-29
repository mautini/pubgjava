package com.github.mautini.pubgjava.model.leaderboard;

import com.google.gson.annotations.SerializedName;

public class LeaderboardPlayerAttributes {

    private String name;

    private Integer rank;

    @SerializedName("stats")
    private LeaderboardPlayerAttributesStats leaderboardPlayerAttributesStats;

    public LeaderboardPlayerAttributes() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public LeaderboardPlayerAttributesStats getLeaderboardPlayerAttributesStats() {
        return leaderboardPlayerAttributesStats;
    }

    public void setLeaderboardPlayerAttributesStats(LeaderboardPlayerAttributesStats leaderboardPlayerAttributesStats) {
        this.leaderboardPlayerAttributesStats = leaderboardPlayerAttributesStats;
    }
}
