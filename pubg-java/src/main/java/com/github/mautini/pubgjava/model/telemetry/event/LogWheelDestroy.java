package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.github.mautini.pubgjava.model.telemetry.object.Vehicle;
import com.google.gson.annotations.SerializedName;

// PC only
public class LogWheelDestroy extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("vehicle")
    private Vehicle vehicle;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageCauseName")
    private String damageCauseName;

    public LogWheelDestroy() {
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
}
