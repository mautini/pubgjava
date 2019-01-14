package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Item;
import com.google.gson.annotations.SerializedName;

/**
 * TelemetryEvent including a character and an item
 */
public abstract class TelemetryEventCharacterItem extends TelemetryEventCharacter {

    private Item item;

    public TelemetryEventCharacterItem() {
        super();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
