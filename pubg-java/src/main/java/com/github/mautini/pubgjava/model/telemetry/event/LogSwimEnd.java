package com.github.mautini.pubgjava.model.telemetry.event;

public class LogSwimEnd extends TelemetryEventCharacter {

    // PC Only
    private Float swimDistance;

    public LogSwimEnd() {
        super();
    }

    public Float getSwimDistance() {
        return swimDistance;
    }

    public void setSwimDistance(Float swimDistance) {
        this.swimDistance = swimDistance;
    }
}
