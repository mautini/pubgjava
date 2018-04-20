package com.github.mautini.pubgjava.model.sample;

import java.time.ZonedDateTime;

public class SampleAttributes {

    private ZonedDateTime createdAt;

    private String shardId;

    private String titleId;

    public SampleAttributes() {
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getShardId() {
        return shardId;
    }

    public void setShardId(String shardId) {
        this.shardId = shardId;
    }

    public String getTitleId() {
        return titleId;
    }

    public void setTitleId(String titleId) {
        this.titleId = titleId;
    }
}