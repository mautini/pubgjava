package com.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.telemetry.object.Character;

import java.util.List;

/**
 * TelemetryEvent related to a list of characters
 */
public abstract class TelemetryEventListCharacters extends TelemetryEvent {

    @SerializedName(value = "characters", alternate = "Characters")
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
