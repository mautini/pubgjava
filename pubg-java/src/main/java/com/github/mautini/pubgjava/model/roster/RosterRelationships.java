package com.github.mautini.pubgjava.model.roster;

import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.participant.Participant;
import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.participant.Participant;

public class RosterRelationships {

    private DataListHolder<Participant> participants;

    public RosterRelationships() {
    }

    public DataListHolder<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(DataListHolder<Participant> participants) {
        this.participants = participants;
    }
}
