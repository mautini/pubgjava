package com.github.mautini.pubgjava;

import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.generic.Entity;
import com.github.mautini.pubgjava.model.participant.Participant;
import com.github.mautini.pubgjava.model.roster.Roster;
import com.github.mautini.pubgjava.model.roster.RosterRelationships;

import java.util.List;
import java.util.stream.Collectors;

public class RosterUtils {

    private Roster roster;

    public RosterUtils(Roster roster) {
        this.roster = roster;
    }

    public List<String> getParticipantsIds() throws PubgClientException {
        return RosterUtils.getParticipantsIds(roster);
    }

    public static List<String> getParticipantsIds(Roster roster) throws PubgClientException {
        RosterRelationships rosterRelationships = roster.getRosterRelationships();

        if (rosterRelationships == null) {
            throw new PubgClientException("Unable to get the relationships of the roster");
        }

        DataListHolder<Participant> participants = rosterRelationships.getParticipants();
        if (participants == null || participants.getData() == null) {
            throw new PubgClientException("Unable to get the participants of the roster");
        }

        return participants.getData().stream()
                .map(Entity::getId)
                .collect(Collectors.toList());
    }
}
