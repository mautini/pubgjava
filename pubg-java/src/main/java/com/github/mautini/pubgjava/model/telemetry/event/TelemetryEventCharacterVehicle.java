package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Vehicle;
import com.google.gson.annotations.SerializedName;

/**
 * TelemetryEvent including a character and a vehicle
 */
public abstract class TelemetryEventCharacterVehicle extends TelemetryEventCharacter {

    @SerializedName("vehicle")
    private Vehicle vehicle;

    public TelemetryEventCharacterVehicle() {
        super();
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
