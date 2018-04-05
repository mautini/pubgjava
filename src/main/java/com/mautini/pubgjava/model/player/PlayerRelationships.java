package com.mautini.pubgjava.model.player;

import com.mautini.pubgjava.model.generic.DataListHolder;
import com.mautini.pubgjava.model.match.Match;

public class PlayerRelationships {

    private DataListHolder<Match> matches;

    public PlayerRelationships() {
    }

    public DataListHolder<Match> getMatches() {
        return matches;
    }

    public void setMatches(DataListHolder<Match> matches) {
        this.matches = matches;
    }
}
