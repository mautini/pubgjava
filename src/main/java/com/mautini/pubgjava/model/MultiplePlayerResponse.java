package com.mautini.pubgjava.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MultiplePlayerResponse {

    @SerializedName("data")
    private List<Player> players;

    public MultiplePlayerResponse() {
        players = new ArrayList<>();
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
