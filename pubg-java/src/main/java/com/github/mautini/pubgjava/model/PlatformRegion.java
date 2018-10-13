package com.github.mautini.pubgjava.model;

import com.google.gson.annotations.SerializedName;

public enum PlatformRegion {
    @SerializedName("xbox-as") XBOX_AS("xbox-as"),
    @SerializedName("xbox-eu") XBOX_EU("xbox-eu"),
    @SerializedName("xbox-na") XBOX_NA("xbox-na"),
    @SerializedName("xbox-oc") XBOX_OC("xbox-oc"),
    @SerializedName("pc-krip") PC_KRJP("pc-krjp"),
    @SerializedName("pc-jp") PC_JP("pc-jp"),
    @SerializedName("pc-na") PC_NA("pc-na"),
    @SerializedName("pc-eu") PC_EU("pc-eu"),
    @SerializedName("pc-ru") PC_RU("pc-ru"),
    @SerializedName("pc-oc") PC_OC("pc-oc"),
    @SerializedName("pc-kakao") PC_KAKAO("pc-kakao"),
    @SerializedName("pc-sea") PC_SEA("pc-sea"),
    @SerializedName("pc-sa") PC_SA("pc-sa"),
    @SerializedName("pc-as") PC_AS("pc-as");

    private final String text;

    PlatformRegion(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}