package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public enum AttackType {
    @SerializedName("RedZone") RED_ZONE("RedZone"),
    @SerializedName("Weapon") WEAPON("Weapon");

    private final String text;

    AttackType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}