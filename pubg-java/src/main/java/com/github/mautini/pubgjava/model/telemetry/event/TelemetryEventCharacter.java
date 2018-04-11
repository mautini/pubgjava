package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.telemetry.object.Character;

/**
 * TelemetryEvent including a character
 */
public abstract class TelemetryEventCharacter extends TelemetryEvent {

    @SerializedName(value = "character", alternate = "Character")
    private Character character;

    public TelemetryEventCharacter() {
        super();
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }
}
