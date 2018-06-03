package com.github.mautini.pubgjava.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName("itemId")
    private String itemId;

    @SerializedName("stackCount")
    private Integer stackCount;

    @SerializedName("category")
    private String category;

    @SerializedName("subCategory")
    private String subCategory;

    @SerializedName("attachedItems")
    private List<String> attachedItems;

    public Item() {
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public Integer getStackCount() {
        return stackCount;
    }

    public void setStackCount(Integer stackCount) {
        this.stackCount = stackCount;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public List<String> getAttachedItems() {
        return attachedItems;
    }

    public void setAttachedItems(List<String> attachedItems) {
        this.attachedItems = attachedItems;
    }
}
