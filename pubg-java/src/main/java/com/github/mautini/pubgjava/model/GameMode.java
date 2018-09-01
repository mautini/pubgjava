package com.github.mautini.pubgjava.model;

import com.google.gson.annotations.SerializedName;

public enum GameMode {
    @SerializedName("duo") DUO,
    @SerializedName("duo-fpp") DUO_FPP,
    @SerializedName("solo") SOLO,
    @SerializedName("solo-fpp") SOLO_FPP,
    @SerializedName("squad") SQUAD,
    @SerializedName("squad-fpp") SQUAD_FPP,
    @SerializedName("normal-duo") NORMAL_DUO,
    @SerializedName("normal-duo-fpp") NORMAL_DUO_FPP,
    @SerializedName("normal-solo") NORMAL_SOLO,
    @SerializedName("normal-solo-fpp") NORMAL_SOLO_FPP,
    @SerializedName("normal-squad") NORMAL_SQUAD,
    @SerializedName("normal-squad-fpp") NORMAL_SQUAD_FPP,
}