package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.telemetry.object.Item;

/**
 * TelemetryEvent including a character and an item
 */
public abstract class TelemetryEventCharacterItem extends TelemetryEventCharacter {

    @SerializedName(value = "item", alternate = "Item")
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
