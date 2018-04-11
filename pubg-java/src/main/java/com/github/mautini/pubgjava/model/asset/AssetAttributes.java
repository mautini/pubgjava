package com.github.mautini.pubgjava.model.asset;

import com.google.gson.annotations.SerializedName;

import java.time.ZonedDateTime;

public class AssetAttributes {

    @SerializedName("URL")
    private String url;

    private ZonedDateTime createdAt;

    private String description;

    private String name;

    public AssetAttributes() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}