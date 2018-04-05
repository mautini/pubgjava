package com.mautini.pubgjava.model.roster;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.generic.Entity;

public class Roster extends Entity {

    @SerializedName("attributes")
    private RosterAttributes rosterAttributes;

    public Roster() {
    }

    public RosterAttributes getRosterAttributes() {
        return rosterAttributes;
    }

    public void setRosterAttributes(RosterAttributes rosterAttributes) {
        this.rosterAttributes = rosterAttributes;
    }
}
