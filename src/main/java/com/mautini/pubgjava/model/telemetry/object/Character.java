package com.mautini.pubgjava.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class Character {

    @SerializedName(value = "name", alternate = "Name")
    private String name;

    @SerializedName(value = "teamId", alternate = "TeamId")
    private String teamId;

    @SerializedName(value = "health", alternate = "Health")
    private Float health;

    @SerializedName(value = "location", alternate = "Location")
    private Location location;

    @SerializedName(value = "ranking", alternate = "Ranking")
    private Integer ranking;

    @SerializedName(value = "accountId", alternate = "AccountId")
    private String accountId;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Float getHealth() {
        return health;
    }

    public void setHealth(Float health) {
        this.health = health;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
