package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;

/**
 * TelemetryEvent including a character
 */
public abstract class TelemetryEventCharacter extends TelemetryEvent {

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
