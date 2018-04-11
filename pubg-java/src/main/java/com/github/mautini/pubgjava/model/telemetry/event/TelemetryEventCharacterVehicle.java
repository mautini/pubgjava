package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.telemetry.object.Vehicle;

/**
 * TelemetryEvent including a character and a vehicle
 */
public abstract class TelemetryEventCharacterVehicle extends TelemetryEventCharacter {

    @SerializedName(value = "vehicle", alternate = "Vehicle")
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
