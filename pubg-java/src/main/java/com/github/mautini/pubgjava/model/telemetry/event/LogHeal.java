package com.github.mautini.pubgjava.model.telemetry.event;

public class LogHeal extends TelemetryEventCharacterItem {

    private float healAmount;

    public LogHeal() {
        super();
    }

    public float getHealAmount() {
        return healAmount;
    }

    public void setHealAmount(float healAmount) {
        this.healAmount = healAmount;
    }
}
