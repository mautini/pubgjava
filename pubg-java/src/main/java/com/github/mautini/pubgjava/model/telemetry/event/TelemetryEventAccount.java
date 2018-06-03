package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

/**
 * TelemetryEvent related to an account
 */
public abstract class TelemetryEventAccount extends TelemetryEvent {

    @SerializedName("accountId")
    private String accountId;

    public TelemetryEventAccount() {
        super();
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
}
