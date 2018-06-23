package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;

public class LogPlayerRevive extends TelemetryEvent {

    @SerializedName("reviver")
    private Character character;

    @SerializedName("victim")
    private Character victim;

    public LogPlayerRevive() {
        super();
    }

    public Character getCharacter() {
        return character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }
}
