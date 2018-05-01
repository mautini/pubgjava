package com.github.mautini.pubgjava.model.playerseason;

import com.google.gson.annotations.SerializedName;

public class GameModeStatsWrapper {

    private GameModeStats duo;

    @SerializedName("duo-fpp")
    private GameModeStats duoFpp;

    private GameModeStats solo;

    @SerializedName("solo-fpp")
    private GameModeStats soloFpp;

    private GameModeStats squad;

    @SerializedName("squad-fpp")
    private GameModeStats squadFpp;

    public GameModeStatsWrapper() {
    }

    public GameModeStats getDuo() {
        return duo;
    }

    public void setDuo(GameModeStats duo) {
        this.duo = duo;
    }

    public GameModeStats getDuoFpp() {
        return duoFpp;
    }

    public void setDuoFpp(GameModeStats duoFpp) {
        this.duoFpp = duoFpp;
    }

    public GameModeStats getSolo() {
        return solo;
    }

    public void setSolo(GameModeStats solo) {
        this.solo = solo;
    }

    public GameModeStats getSoloFpp() {
        return soloFpp;
    }

    public void setSoloFpp(GameModeStats soloFpp) {
        this.soloFpp = soloFpp;
    }

    public GameModeStats getSquad() {
        return squad;
    }

    public void setSquad(GameModeStats squad) {
        this.squad = squad;
    }

    public GameModeStats getSquadFpp() {
        return squadFpp;
    }

    public void setSquadFpp(GameModeStats squadFpp) {
        this.squadFpp = squadFpp;
    }
}
