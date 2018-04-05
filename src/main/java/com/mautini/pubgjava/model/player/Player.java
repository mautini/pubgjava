package com.mautini.pubgjava.model.player;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.generic.Entity;

public class Player extends Entity {

    @SerializedName("attributes")
    private PlayerAttributes playerAttributes;

    @SerializedName("relationships")
    private PlayerRelationships playerRelationships;

    public Player() {
        super();
    }

    public PlayerAttributes getPlayerAttributes() {
        return playerAttributes;
    }

    public void setPlayerAttributes(PlayerAttributes playerAttributes) {
        this.playerAttributes = playerAttributes;
    }

    public PlayerRelationships getPlayerRelationships() {
        return playerRelationships;
    }

    public void setPlayerRelationships(PlayerRelationships playerRelationships) {
        this.playerRelationships = playerRelationships;
    }
}
