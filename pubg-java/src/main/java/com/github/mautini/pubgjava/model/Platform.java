package com.github.mautini.pubgjava.model;

import com.google.gson.annotations.SerializedName;

public enum Platform {
    @SerializedName("steam") STEAM("steam"),
    @SerializedName("psn") PSN("psn"),
    @SerializedName("kakao") KAKAO("kakao"),
    @SerializedName("xbox") XBOX("xbox");

    private final String text;

    Platform(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
