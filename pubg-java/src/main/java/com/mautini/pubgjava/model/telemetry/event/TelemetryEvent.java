package com.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.telemetry.object.Common;

import java.time.ZonedDateTime;

public abstract class TelemetryEvent {

    @SerializedName("_V")
    private Integer version;

    @SerializedName("_D")
    private ZonedDateTime timestamp;

    @SerializedName("_T")
    private String type;

    // PC Only
    private Common common;

    public TelemetryEvent() {
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }
}
