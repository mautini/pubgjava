package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Item;

public class LogHeal extends TelemetryEventCharacter {

    private Item item;
    private float healAmount;

    public LogHeal() {
        super();
    }

    public Item getItem() {
        return item;
    }

    public float getHealAmount() {
        return healAmount;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setHealAmount(float healAmount) {
        this.healAmount = healAmount;
    }
}
