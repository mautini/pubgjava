package com.github.mautini.pubgjava.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class Vehicle {

    @SerializedName(value = "vehicleType", alternate = "VehicleType")
    private String vehicleType;

    @SerializedName(value = "vehicleId", alternate = "VehicleId")
    private String vehicleId;

    @SerializedName(value = "healthPercent", alternate = "HealthPercent")
    private Float healthPercent;

    @SerializedName(value = "feulPercent", alternate = "FeulPercent")
    private Float feulPercent;

    public Vehicle() {
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public Float getHealthPercent() {
        return healthPercent;
    }

    public void setHealthPercent(Float healthPercent) {
        this.healthPercent = healthPercent;
    }

    public Float getFeulPercent() {
        return feulPercent;
    }

    public void setFeulPercent(Float feulPercent) {
        this.feulPercent = feulPercent;
    }
}
