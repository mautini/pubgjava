package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * TelemetryEvent related to a list of characters
 */
public abstract class TelemetryEventListCharacters extends TelemetryEvent {

    @SerializedName("characters")
    private List<Character> characters;

    public TelemetryEventListCharacters() {
        super();
    }

    public List<Character> getCharacters() {
        return characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }
}
