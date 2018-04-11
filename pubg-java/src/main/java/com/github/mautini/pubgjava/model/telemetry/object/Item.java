package com.github.mautini.pubgjava.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Item {

    @SerializedName(value = "itemId", alternate = "ItemId")
    private String itemId;

    @SerializedName(value = "stackCount", alternate = "StackCount")
    private Integer stackCount;

    @SerializedName(value = "category", alternate = "Category")
    private String category;

    @SerializedName(value = "subCategory", alternate = "SubCategory")
    private String subCategory;

    @SerializedName(value = "attachedItems", alternate = "AttachedItems")
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
