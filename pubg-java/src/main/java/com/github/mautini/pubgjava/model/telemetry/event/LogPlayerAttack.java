package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.github.mautini.pubgjava.model.telemetry.object.Item;
import com.github.mautini.pubgjava.model.telemetry.object.Vehicle;
import com.google.gson.annotations.SerializedName;

public class LogPlayerAttack extends TelemetryEvent {

    @SerializedName(value = "attackId", alternate = "AttackId")
    private Integer attackId;

    @SerializedName(value = "attacker", alternate = "Attacker")
    private Character attacker;

    @SerializedName(value = "attackType", alternate = "AttackType")
    private AttackType attackType;

    @SerializedName(value = "weapon", alternate = "Weapon")
    private Item weapon;

    @SerializedName(value = "vehicle", alternate = "Vehicle")
    private Vehicle vehicle;

    public LogPlayerAttack() {
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

    public AttackType getAttackType() {
        return attackType;
    }

    public void setAttackType(AttackType attackType) {
        this.attackType = attackType;
    }

    public Item getWeapon() {
        return weapon;
    }

    public void setWeapon(Item weapon) {
        this.weapon = weapon;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
