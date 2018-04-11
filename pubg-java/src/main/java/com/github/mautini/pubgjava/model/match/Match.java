package com.github.mautini.pubgjava.model.match;

import com.github.mautini.pubgjava.model.Links;
import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.Links;
import com.github.mautini.pubgjava.model.generic.Entity;

public class Match extends Entity {

    @SerializedName("attributes")
    private MatchAttributes matchAttributes;

    @SerializedName("relationships")
    private MatchRelationships matchRelationships;

    private Links links;

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

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
