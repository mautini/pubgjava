package com.mautini.pubgjava.model;

import com.mautini.pubgjava.model.generic.DataListHolder;
import com.mautini.pubgjava.model.match.Match;

public class Relationships {

    private DataListHolder<Match> matches;

    public Relationships() {
    }

    public DataListHolder<Match> getMatches() {
        return matches;
    }

    public void setMatches(DataListHolder<Match> matches) {
        this.matches = matches;
    }
}
