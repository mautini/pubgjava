package com.github.mautini.pubgjava.model.player;

import com.github.mautini.pubgjava.model.asset.Asset;
import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.match.Match;
import com.github.mautini.pubgjava.model.asset.Asset;
import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.match.Match;

public class PlayerRelationships {

    private DataListHolder<Match> matches;

    private DataListHolder<Asset> assets;

    public PlayerRelationships() {
    }

    public DataListHolder<Match> getMatches() {
        return matches;
    }

    public void setMatches(DataListHolder<Match> matches) {
        this.matches = matches;
    }

    public DataListHolder<Asset> getAssets() {
        return assets;
    }

    public void setAssets(DataListHolder<Asset> assets) {
        this.assets = assets;
    }
}
