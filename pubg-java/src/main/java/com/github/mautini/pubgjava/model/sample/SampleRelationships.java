package com.github.mautini.pubgjava.model.sample;

import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.match.Match;

public class SampleRelationships {

    private DataListHolder<Match> matches;

    public SampleRelationships() {
    }

    public DataListHolder<Match> getMatches() {
        return matches;
    }

    public void setMatches(DataListHolder<Match> matches) {
        this.matches = matches;
    }
}
