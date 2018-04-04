package com.mautini.pubgjava.model.player;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.Relationships;
import com.mautini.pubgjava.model.generic.Entity;

public class Player extends Entity {

    @SerializedName("attributes")
    private PlayerAttributes playerAttributes;

    private Relationships relationships;

    public Player() {
        super();
    }

    public PlayerAttributes getPlayerAttributes() {
        return playerAttributes;
    }

    public void setPlayerAttributes(PlayerAttributes playerAttributes) {
        this.playerAttributes = playerAttributes;
    }

    public Relationships getRelationships() {
        return relationships;
    }

    public void setRelationships(Relationships relationships) {
        this.relationships = relationships;
    }
}
