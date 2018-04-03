package com.mautini.pubgjava.model;

import com.google.gson.annotations.SerializedName;

public class Player {

    private String type;

    private String id;

    @SerializedName("attributes")
    private PlayerAttributes playerAttributes;

    public Player() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PlayerAttributes getPlayerAttributes() {
        return playerAttributes;
    }

    public void setPlayerAttributes(PlayerAttributes playerAttributes) {
        this.playerAttributes = playerAttributes;
    }
}
