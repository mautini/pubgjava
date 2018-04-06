package com.mautini.pubgjava.model;

public enum Shard {
    XBOX_AS("xbox-as"),
    XBOX_EU("xbox-eu"),
    XBOX_NA("xbox-na"),
    XBOX_OC("xbox-oc"),
    PC_KRJP("pc-krjp"),
    PC_NA("pc-na"),
    PC_EU("pc-eu"),
    PC_OC("pc-oc"),
    PC_KAKAO("pc-kakao"),
    PC_SEA("pc-sea"),
    PC_SA("pc-sa"),
    PC_AS("pc-as");

    private final String text;

    Shard(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}