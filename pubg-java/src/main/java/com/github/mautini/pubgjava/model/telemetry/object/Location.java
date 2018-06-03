package com.github.mautini.pubgjava.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("x")
    private Float x;

    @SerializedName("y")
    private Float y;

    @SerializedName("z")
    private Float z;

    public Location() {
    }

    public Float getX() {
        return x;
    }

    public void setX(Float x) {
        this.x = x;
    }

    public Float getY() {
        return y;
    }

    public void setY(Float y) {
        this.y = y;
    }

    public Float getZ() {
        return z;
    }

    public void setZ(Float z) {
        this.z = z;
    }
}
