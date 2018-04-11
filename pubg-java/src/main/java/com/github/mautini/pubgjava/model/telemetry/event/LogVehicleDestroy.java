package com.github.mautini.pubgjava.model.telemetry.event;

import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.github.mautini.pubgjava.model.telemetry.object.Vehicle;

public class LogVehicleDestroy extends TelemetryEvent {

    @SerializedName(value = "attackId", alternate = "AttackId")
    private Integer attackId;

    @SerializedName(value = "attacker", alternate = "Attacker")
    private Character attacker;

    @SerializedName(value = "vehicle", alternate = "Vehicle")
    private Vehicle vehicle;

    @SerializedName(value = "damageTypeCategory", alternate = "DamageTypeCategory")
    private String damageTypeCategory;

    @SerializedName(value = "damageCauseName", alternate = "DamageCauseName")
    private String damageCauseName;

    @SerializedName(value = "distance", alternate = "Distance")
    private Float distance;

    public LogVehicleDestroy() {
        super();
    }

    public Integer getAttackId() {
        return attackId;
    }

    public void setAttackId(Integer attackId) {
        this.attackId = attackId;
    }

    public Character getAttacker() {
        return attacker;
    }

    public void setAttacker(Character attacker) {
        this.attacker = attacker;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getDamageTypeCategory() {
        return damageTypeCategory;
    }

    public void setDamageTypeCategory(String damageTypeCategory) {
        this.damageTypeCategory = damageTypeCategory;
    }

    public String getDamageCauseName() {
        return damageCauseName;
    }

    public void setDamageCauseName(String damageCauseName) {
        this.damageCauseName = damageCauseName;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
