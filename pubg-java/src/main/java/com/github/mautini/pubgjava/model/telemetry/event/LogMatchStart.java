package com.github.mautini.pubgjava.model.telemetry.event;

public class LogMatchStart extends TelemetryEventListCharacters {

    private String mapName;

    private String weatherId;

    private String cameraViewBehaviour;

    private Integer teamSize;

    private Boolean isCustomGame;

    private Boolean isEventMode;

    // See here for options about the bluezone
    // https://documentation.playbattlegrounds.com/en/telemetry-objects.html#bluezonecustomoptions
    private String blueZoneCustomOptions;

    public LogMatchStart() {
        super();
    }

    public String getMapName() {
        return mapName;
    }

    public void setMapName(String mapName) {
        this.mapName = mapName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getCameraViewBehaviour() {
        return cameraViewBehaviour;
    }

    public void setCameraViewBehaviour(String cameraViewBehaviour) {
        this.cameraViewBehaviour = cameraViewBehaviour;
    }

    public Integer getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(Integer teamSize) {
        this.teamSize = teamSize;
    }

    public Boolean getCustomGame() {
        return isCustomGame;
    }

    public void setCustomGame(Boolean customGame) {
        isCustomGame = customGame;
    }

    public Boolean getEventMode() {
        return isEventMode;
    }

    public void setEventMode(Boolean eventMode) {
        isEventMode = eventMode;
    }

    public String getBlueZoneCustomOptions() {
        return blueZoneCustomOptions;
    }

    public void setBlueZoneCustomOptions(String blueZoneCustomOptions) {
        this.blueZoneCustomOptions = blueZoneCustomOptions;
    }
}
