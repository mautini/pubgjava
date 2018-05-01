package com.github.mautini.pubgjava.model.match;

import com.github.mautini.pubgjava.model.GameMode;
import com.github.mautini.pubgjava.model.Map;

import java.time.ZonedDateTime;

public class MatchAttributes {

    private ZonedDateTime createdAt;

    private Integer duration;

    private GameMode gameMode;

    private String patchVersion;

    private String shardId;

    private String titleId;

    private Map mapName;

    public MatchAttributes() {
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public GameMode getGameMode() {
        return gameMode;
    }

    public void setGameMode(GameMode gameMode) {
        this.gameMode = gameMode;
    }

    public String getPatchVersion() {
        return patchVersion;
    }

    public void setPatchVersion(String patchVersion) {
        this.patchVersion = patchVersion;
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

    public Map getMapName() {
        return mapName;
    }

    public void setMapName(Map mapName) {
        this.mapName = mapName;
    }
}