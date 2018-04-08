package com.mautini.pubgjava.model.telemetry.event;

public enum AttackType {
    RED_ZONE("RedZone"),
    WEAPON("Weapon");

    private final String text;

    AttackType(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}