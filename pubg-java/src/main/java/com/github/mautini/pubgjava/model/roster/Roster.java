package com.github.mautini.pubgjava.model.roster;

import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.generic.Entity;

public class Roster extends Entity {

    @SerializedName("attributes")
    private RosterAttributes rosterAttributes;

    @SerializedName("relationships")
    private RosterRelationships rosterRelationships;

    public Roster() {
    }

    public RosterAttributes getRosterAttributes() {
        return rosterAttributes;
    }

    public void setRosterAttributes(RosterAttributes rosterAttributes) {
        this.rosterAttributes = rosterAttributes;
    }

    public RosterRelationships getRosterRelationships() {
        return rosterRelationships;
    }

    public void setRosterRelationships(RosterRelationships rosterRelationships) {
        this.rosterRelationships = rosterRelationships;
    }
}
