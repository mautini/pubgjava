package com.github.mautini.pubgjava.model.leaderboard;

public class LeaderboardPlayerAttributesStats {

    private Double rankPoints;

    private Integer wins;

    private Integer games;

    private Double winRatio;

    private Integer averageDamage;

    private Integer kills;

    private Double killDeathRatio;

    public LeaderboardPlayerAttributesStats() {
    }

    public Double getRankPoints() {
        return rankPoints;
    }

    public void setRankPoints(Double rankPoints) {
        this.rankPoints = rankPoints;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getGames() {
        return games;
    }

    public void setGames(Integer games) {
        this.games = games;
    }

    public Double getWinRatio() {
        return winRatio;
    }

    public void setWinRatio(Double winRatio) {
        this.winRatio = winRatio;
    }

    public Integer getAverageDamage() {
        return averageDamage;
    }

    public void setAverageDamage(Integer averageDamage) {
        this.averageDamage = averageDamage;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Double getKillDeathRatio() {
        return killDeathRatio;
    }

    public void setKillDeathRatio(Double killDeathRatio) {
        this.killDeathRatio = killDeathRatio;
    }
}
