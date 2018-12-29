package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Vehicle;

public class LogPlayerPosition extends TelemetryEventCharacter {

    private Float elapsedTime;

    private Integer numAlivePlayers;

    private Vehicle vehicle;

    public Float getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Float elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getNumAlivePlayers() {
        return numAlivePlayers;
    }

    public void setNumAlivePlayers(Integer numAlivePlayers) {
        this.numAlivePlayers = numAlivePlayers;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
