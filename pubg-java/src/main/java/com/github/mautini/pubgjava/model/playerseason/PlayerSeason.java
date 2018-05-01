package com.github.mautini.pubgjava.model.playerseason;

import com.google.gson.annotations.SerializedName;

public class PlayerSeason {

    private String type;

    @SerializedName("attributes")
    private PlayerSeasonAttributes playerSeasonAttributes;

    @SerializedName("relationships")
    private PlayerSeasonRelationships playerSeasonRelationships;

    public PlayerSeason() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PlayerSeasonAttributes getPlayerSeasonAttributes() {
        return playerSeasonAttributes;
    }

    public void setPlayerSeasonAttributes(PlayerSeasonAttributes playerSeasonAttributes) {
        this.playerSeasonAttributes = playerSeasonAttributes;
    }

    public PlayerSeasonRelationships getPlayerSeasonRelationships() {
        return playerSeasonRelationships;
    }

    public void setPlayerSeasonRelationships(PlayerSeasonRelationships playerSeasonRelationships) {
        this.playerSeasonRelationships = playerSeasonRelationships;
    }
}
