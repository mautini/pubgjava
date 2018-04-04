package com.mautini.pubgjava.model;

import com.mautini.pubgjava.model.generic.DataListHolder;

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
