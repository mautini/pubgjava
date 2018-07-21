package com.github.mautini.pubgjava.model.tournament;

import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.match.Match;

public class TournamentRelationships {

    private DataListHolder<Match> matches;

    public TournamentRelationships() {
    }

    public DataListHolder<Match> getMatches() {
        return matches;
    }

    public void setMatches(DataListHolder<Match> matches) {
        this.matches = matches;
    }
}
