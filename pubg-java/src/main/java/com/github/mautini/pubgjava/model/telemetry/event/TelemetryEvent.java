package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Common;
import com.google.gson.annotations.SerializedName;

import java.time.ZonedDateTime;

public abstract class TelemetryEvent {

    @SerializedName("_D")
    private ZonedDateTime timestamp;

    @SerializedName("_T")
    private String type;

    private Common common;

    public TelemetryEvent() {
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
