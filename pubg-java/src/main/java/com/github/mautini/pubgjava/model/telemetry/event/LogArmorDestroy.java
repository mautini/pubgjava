package com.github.mautini.pubgjava.model.telemetry.event;

import com.github.mautini.pubgjava.model.telemetry.object.Character;
import com.github.mautini.pubgjava.model.telemetry.object.Item;
import com.google.gson.annotations.SerializedName;

public class LogArmorDestroy extends TelemetryEvent {

    @SerializedName("attackId")
    private Integer attackId;

    @SerializedName("attacker")
    private Character attacker;

    @SerializedName("victim")
    private Character victim;

    @SerializedName("damageTypeCategory")
    private String damageTypeCategory;

    @SerializedName("damageReason")
    private DamageReason damageReason;

    @SerializedName("damageCauserName")
    private String damageCauserName;

    @SerializedName("item")
    private Item item;

    @SerializedName("distance")
    private Float distance;

    public LogArmorDestroy() {
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

    public String getDamageCauserName() {
        return damageCauserName;
    }

    public void setDamageCauserName(String damageCauserName) {
        this.damageCauserName = damageCauserName;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Float getDistance() {
        return distance;
    }

    public void setDistance(Float distance) {
        this.distance = distance;
    }
}
