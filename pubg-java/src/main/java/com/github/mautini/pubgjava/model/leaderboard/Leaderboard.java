package com.github.mautini.pubgjava.model.leaderboard;

import com.github.mautini.pubgjava.model.Links;
import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Leaderboard extends Entity {

    @SerializedName("attributes")
    private LeaderboardAttributes leaderboardAttributes;

    @SerializedName("relationships")
    private LeaderboardRelationships leaderboardRelationships;

    @SerializedName("included")
    private List<LeaderboardPlayer> leaderboardPlayers;

    private Links links;

    public Leaderboard() {
    }


}
