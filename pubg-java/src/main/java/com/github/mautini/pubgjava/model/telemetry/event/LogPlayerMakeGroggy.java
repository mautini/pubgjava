package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;

// PC Only
public class LogPlayerMakeGroggy extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("victim")
    private Character victim;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageCauserName")
    private String damageCauserName;

    @SerializedName("distance")
    private Float distance;

    @SerializedName("isAttackerInVehicle")
    private Boolean isAttackerInVehicle;

    @SerializedName("dBNOId")
    private int dBNOId;

    public LogPlayerMakeGroggy() {
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

    public Character getVictim() {
        return victim;
    }

    public void setVictim(Character victim) {
        this.victim = victim;
    }

    public String getDamageTypeCategory() {
        return damageTypeCategory;
    }

    public void setDamageTypeCategory(String damageTypeCategory) {
        this.damageTypeCategory = damageTypeCategory;
    }

    public String getDamageCauserName() {
        return damageCauserName;
    }

    public void setDamageCauserName(String damageCauserName) {
        this.damageCauserName = damageCauserName;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }

    public Boolean getAttackerInVehicle() {
        return isAttackerInVehicle;
    }

    public void setAttackerInVehicle(Boolean attackerInVehicle) {
        isAttackerInVehicle = attackerInVehicle;
    }

    public int getdBNOId() {
        return dBNOId;
    }

    public void setdBNOId(int dBNOId) {
        this.dBNOId = dBNOId;
    }
}
