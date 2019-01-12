package com.github.mautini.pubgjava.model.telemetry.event;

/*
From PUBG docs:

[PC Only]

"character": {Character},
"weaponId":  string,
"fireCount": int            // Increments of 10

 */

public class LogWeaponFireCount extends TelemetryEventCharacterItem {
    private Integer fireCount;

    private String weaponId;

    public Integer getFireCount() {
        return fireCount;
    }

    public void setFireCount(Integer fireCount) {
        this.fireCount = fireCount;
    }

    public String getWeaponId() {
        return weaponId;
    }

    public void setWeaponId(String weaponId) {
        this.weaponId = weaponId;
    }
}
