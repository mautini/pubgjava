package com.github.mautini.pubgjava.model.telemetry.object;

import com.google.gson.annotations.SerializedName;

public class GameState {

    @SerializedName("elapsedTime")
    private Integer elapsedTime;

    @SerializedName("numAliveTeams")
    private Integer numAliveTeams;

    @SerializedName("numJoinPlayers")
    private Integer numJoinPlayers;

    @SerializedName("numStartPlayers")
    private Integer numStartPlayers;

    @SerializedName("numAlivePlayers")
    private Integer numAlivePlayers;

    @SerializedName("safetyZonePosition")
    private Location safetyZonePosition;

    @SerializedName("safetyZoneRadius")
    private Float safetyZoneRadius;

    @SerializedName("poisonGasWarningPosition")
    private Location poisonGasWarningPosition;

    @SerializedName("poisonGasWarningRadius")
    private Float poisonGasWarningRadius;

    @SerializedName("redZonePosition")
    private Location redZonePosition;

    @SerializedName("redZoneRadius")
    private Float redZoneRadius;

    public GameState() {
    }

    public Integer getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(Integer elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public Integer getNumAliveTeams() {
        return numAliveTeams;
    }

    public void setNumAliveTeams(Integer numAliveTeams) {
        this.numAliveTeams = numAliveTeams;
    }

    public Integer getNumJoinPlayers() {
        return numJoinPlayers;
    }

    public void setNumJoinPlayers(Integer numJoinPlayers) {
        this.numJoinPlayers = numJoinPlayers;
    }

    public Integer getNumStartPlayers() {
        return numStartPlayers;
    }

    public void setNumStartPlayers(Integer numStartPlayers) {
        this.numStartPlayers = numStartPlayers;
    }

    public Integer getNumAlivePlayers() {
        return numAlivePlayers;
    }

    public void setNumAlivePlayers(Integer numAlivePlayers) {
        this.numAlivePlayers = numAlivePlayers;
    }

    public Location getSafetyZonePosition() {
        return safetyZonePosition;
    }

    public void setSafetyZonePosition(Location safetyZonePosition) {
        this.safetyZonePosition = safetyZonePosition;
    }

    public Float getSafetyZoneRadius() {
        return safetyZoneRadius;
    }

    public void setSafetyZoneRadius(Float safetyZoneRadius) {
        this.safetyZoneRadius = safetyZoneRadius;
    }

    public Location getPoisonGasWarningPosition() {
        return poisonGasWarningPosition;
    }

    public void setPoisonGasWarningPosition(Location poisonGasWarningPosition) {
        this.poisonGasWarningPosition = poisonGasWarningPosition;
    }

    public Float getPoisonGasWarningRadius() {
        return poisonGasWarningRadius;
    }

    public void setPoisonGasWarningRadius(Float poisonGasWarningRadius) {
        this.poisonGasWarningRadius = poisonGasWarningRadius;
    }

    public Location getRedZonePosition() {
        return redZonePosition;
    }

    public void setRedZonePosition(Location redZonePosition) {
        this.redZonePosition = redZonePosition;
    }

    public Float getRedZoneRadius() {
        return redZoneRadius;
    }

    public void setRedZoneRadius(Float redZoneRadius) {
        this.redZoneRadius = redZoneRadius;
    }
}
