package com.mautini.pubgjava.model;

import com.google.gson.annotations.SerializedName;

public class SinglePlayerResponse {

    @SerializedName("data")
    private Player player;

    public SinglePlayerResponse() {
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
