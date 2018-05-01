package com.github.mautini.pubgjava.model.season;

import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;

public class Season extends Entity {

    @SerializedName("attributes")
    private SeasonAttributes seasonAttributes;

    public Season() {
        super();
    }

    public SeasonAttributes getSeasonAttributes() {
        return seasonAttributes;
    }

    public void setSeasonAttributes(SeasonAttributes seasonAttributes) {
        this.seasonAttributes = seasonAttributes;
    }
}
