package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public enum DamageReason {
    @SerializedName("ArmShot") ARM_SHOT("ArmShot"),
    @SerializedName("HeadShot") HEAD_SHOT("HeadShot"),
    @SerializedName("LegShot") LEG_SHOT("LegShot"),
    @SerializedName("None") NONE("None"),
    @SerializedName("NonSpecific") NON_SPECIFIC("NonSpecific"),
    @SerializedName("PelvisShot") PELVIS_SHOT("PelvisShot"),
    @SerializedName("TorsoShot") TORSO_SHOT("TorsoShot");

    private final String text;

    DamageReason(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
