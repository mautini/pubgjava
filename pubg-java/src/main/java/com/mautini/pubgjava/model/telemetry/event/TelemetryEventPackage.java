package com.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.telemetry.object.ItemPackage;

/**
 * TelemetryEvent related to a package
 */
public abstract class TelemetryEventPackage extends TelemetryEvent {

    @SerializedName(value = "itemPackage", alternate = "ItemPackage")
    private ItemPackage itemPackage;

    public TelemetryEventPackage() {
        super();
    }

    public ItemPackage getItemPackage() {
        return itemPackage;
    }

    public void setItemPackage(ItemPackage itemPackage) {
        this.itemPackage = itemPackage;
    }
}
