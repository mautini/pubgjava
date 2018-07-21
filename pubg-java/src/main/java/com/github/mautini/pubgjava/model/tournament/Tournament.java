package com.github.mautini.pubgjava.model.tournament;

import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;

public class Tournament extends Entity {

    @SerializedName("relationships")
    private TournamentRelationships tournamentRelationships;

    public Tournament() {
        super();
    }

    public TournamentRelationships getTournamentRelationships() {
        return tournamentRelationships;
    }

    public void setTournamentRelationships(TournamentRelationships tournamentRelationships) {
        this.tournamentRelationships = tournamentRelationships;
    }
}
