package com.github.mautini.pubgjava.model.status;

import java.time.ZonedDateTime;

public class StatusAttributes {

    private ZonedDateTime releasedAt;

    private String version;

    public StatusAttributes() {
    }

    public ZonedDateTime getReleasedAt() {
        return releasedAt;
    }

    public void setReleasedAt(ZonedDateTime releasedAt) {
        this.releasedAt = releasedAt;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
