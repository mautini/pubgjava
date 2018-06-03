package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogPlayerLogin extends TelemetryEventAccount {

    @SerializedName("result")
    private Boolean result;

    @SerializedName("errorMessage")
    private String errorMessage;

    public LogPlayerLogin() {
        super();
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
