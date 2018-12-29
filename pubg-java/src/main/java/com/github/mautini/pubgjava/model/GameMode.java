package com.github.mautini.pubgjava.model;

import com.google.gson.annotations.SerializedName;

public enum GameMode {
    @SerializedName("duo") DUO("duo"),
    @SerializedName("duo-fpp") DUO_FPP("duo-fpp"),
    @SerializedName("solo") SOLO("solo"),
    @SerializedName("solo-fpp") SOLO_FPP("solo-fpp"),
    @SerializedName("squad") SQUAD("squad"),
    @SerializedName("squad-fpp") SQUAD_FPP("squad-fpp"),
    @SerializedName("normal-duo") NORMAL_DUO("normal-duo"),
    @SerializedName("normal-duo-fpp") NORMAL_DUO_FPP("normal-duo-fpp"),
    @SerializedName("normal-solo") NORMAL_SOLO("normal-solo"),
    @SerializedName("normal-solo-fpp") NORMAL_SOLO_FPP("normal-solo-fpp"),
    @SerializedName("normal-squad") NORMAL_SQUAD("normal-squad"),
    @SerializedName("normal-squad-fpp") NORMAL_SQUAD_FPP("normal-squad-fpp");

    private final String text;

    GameMode(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}