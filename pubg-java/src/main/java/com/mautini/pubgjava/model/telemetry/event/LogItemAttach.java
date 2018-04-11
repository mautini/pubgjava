package com.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.telemetry.object.Item;

public class LogItemAttach extends TelemetryEventCharacter {

    @SerializedName(value = "parentItem", alternate = "ParentItem")
    private Item parentItem;

    @SerializedName(value = "childItem", alternate = "ChildItem")
    private Item childItem;

    public LogItemAttach() {
        super();
    }

    public Item getParentItem() {
        return parentItem;
    }

    public void setParentItem(Item parentItem) {
        this.parentItem = parentItem;
    }

    public Item getChildItem() {
        return childItem;
    }

    public void setChildItem(Item childItem) {
        this.childItem = childItem;
    }
}
