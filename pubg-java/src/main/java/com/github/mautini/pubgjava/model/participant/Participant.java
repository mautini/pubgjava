package com.github.mautini.pubgjava.model.participant;

import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.generic.Entity;

public class Participant extends Entity {

    @SerializedName("attributes")
    private ParticipantAttributes participantAttributes;

    public Participant() {
    }

    public ParticipantAttributes getParticipantAttributes() {
        return participantAttributes;
    }

    public void setParticipantAttributes(ParticipantAttributes participantAttributes) {
        this.participantAttributes = participantAttributes;
    }
}
