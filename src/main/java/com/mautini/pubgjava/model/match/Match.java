package com.mautini.pubgjava.model.match;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.generic.Entity;

public class Match extends Entity {

    @SerializedName("attributes")
    private MatchAttributes matchAttributes;

    @SerializedName("relationships")
    private MatchRelationships matchRelationships;

    public Match() {
    }

    public MatchAttributes getMatchAttributes() {
        return matchAttributes;
    }

    public void setMatchAttributes(MatchAttributes matchAttributes) {
        this.matchAttributes = matchAttributes;
    }

    public MatchRelationships getMatchRelationships() {
        return matchRelationships;
    }

    public void setMatchRelationships(MatchRelationships matchRelationships) {
        this.matchRelationships = matchRelationships;
    }
}
