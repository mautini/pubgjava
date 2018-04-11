package com.github.mautini.pubgjava.model.telemetry.object;

public enum Map {
    DESERT_MAIN("Desert_Main"),
    ERANGEL_MAIN("Erangel_Main");

    private final String text;

    Map(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}