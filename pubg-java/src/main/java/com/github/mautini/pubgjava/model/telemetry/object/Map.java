package com.github.mautini.pubgjava.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public enum Map {
    @SerializedName("Desert_Main") DESERT_MAIN("Desert_Main"),
    @SerializedName("Erangel_Main") ERANGEL_MAIN("Erangel_Main");

    private String text;

    Map(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return text;
    }
}