package com.mautini.pubgjava.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ItemPackage {

    @SerializedName(value = "itemPackageId", alternate = "ItemPackageId")
    private String itemPackageId;

    @SerializedName(value = "location", alternate = "Location")
    private Location location;

    @SerializedName(value = "items", alternate = "Items")
    private List<Item> items;

    public ItemPackage() {
    }

    public String getItemPackageId() {
        return itemPackageId;
    }

    public void setItemPackageId(String itemPackageId) {
        this.itemPackageId = itemPackageId;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
