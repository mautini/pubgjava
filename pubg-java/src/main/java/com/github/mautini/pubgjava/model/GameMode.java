package com.github.mautini.pubgjava.model;

import com.google.gson.annotations.SerializedName;

public enum GameMode {
    @SerializedName("duo") DUO,
    @SerializedName("duo-fpp") DUO_FPP,
    @SerializedName("solo") SOLO,
    @SerializedName("solo-fpp") SOLO_FPP,
    @SerializedName("squad") SQUAD,
    @SerializedName("squad-fpp") SQUAD_FPP,
}