package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;

public class LogVehicleLeave extends TelemetryEventCharacterVehicle {

    // PC Only
    @SerializedName("rideDistance")
    private Float rideDistance;

    public LogVehicleLeave() {
        super();
    }

    public Float getRideDistance() {
        return rideDistance;
    }

    public void setRideDistance(Float rideDistance) {
        this.rideDistance = rideDistance;
    }
}
