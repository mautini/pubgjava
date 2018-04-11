package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.telemetry.object.Character;

public class LogPlayerTakeDamage extends TelemetryEvent {

    @SerializedName(value = "attackId", alternate = "AttackId")
    private Integer attackId;

    @SerializedName(value = "attacker", alternate = "Attacker")
    private Character attacker;

    @SerializedName(value = "victim", alternate = "Victim")
    private Character victim;

    @SerializedName(value = "damageTypeCategory", alternate = "DamageTypeCategory")
    private String damageTypeCategory;

    @SerializedName(value = "damageReason", alternate = "DamageReason")
    private DamageReason damageReason;

    @SerializedName(value = "damage", alternate = "Damage")
    private Float damage;

    @SerializedName(value = "damageCauserName", alternate = "DamageCauserName")
    private String damageCauserName;

    public LogPlayerTakeDamage() {
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

    public DamageReason getDamageReason() {
        return damageReason;
    }

    public void setDamageReason(DamageReason damageReason) {
        this.damageReason = damageReason;
    }

    public Float getDamage() {
        return damage;
    }

    public void setDamage(Float damage) {
        this.damage = damage;
    }

    public String getDamageCauserName() {
        return damageCauserName;
    }

    public void setDamageCauserName(String damageCauserName) {
        this.damageCauserName = damageCauserName;
    }
}
