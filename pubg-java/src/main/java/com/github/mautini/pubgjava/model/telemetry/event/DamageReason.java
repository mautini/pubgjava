package com.github.mautini.pubgjava.model.telemetry.event;

public enum DamageReason {
    ARM_SHOT("ArmShot"),
    HEAD_SHOT("HeadShot"),
    LEG_SHOT("LegShot"),
    NONE("None"),
    NON_SPECIFIC("NonSpecific"),
    PELVIS_SHOT("PelvisShot"),
    TORSO_SHOT("TorsoShot");

    private final String text;

    DamageReason(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
