package com.mautini.pubgjava.model.match;

import com.mautini.pubgjava.model.generic.DataListHolder;
import com.mautini.pubgjava.model.roster.Roster;

public class MatchRelationships {

    private DataListHolder<Roster> rosters;

    public MatchRelationships() {
    }

    public DataListHolder<Roster> getRosters() {
        return rosters;
    }

    public void setRosters(DataListHolder<Roster> rosters) {
        this.rosters = rosters;
    }
}
