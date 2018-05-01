package com.github.mautini.pubgjava.model.season;

import com.google.gson.annotations.SerializedName;

public class SeasonAttributes {

    private Boolean isCurrentSeason;

    @SerializedName("isOffseason")
    private Boolean isOffSeason;

    public SeasonAttributes() {
    }

    public Boolean getCurrentSeason() {
        return isCurrentSeason;
    }

    public void setCurrentSeason(Boolean currentSeason) {
        isCurrentSeason = currentSeason;
    }

    public Boolean getOffseason() {
        return isOffSeason;
    }

    public void setOffseason(Boolean offseason) {
        isOffSeason = offseason;
    }
}
