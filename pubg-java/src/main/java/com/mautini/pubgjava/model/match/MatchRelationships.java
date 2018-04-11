package com.mautini.pubgjava.model.match;

import com.mautini.pubgjava.model.asset.Asset;
import com.mautini.pubgjava.model.generic.DataListHolder;
import com.mautini.pubgjava.model.roster.Roster;

public class MatchRelationships {

    private DataListHolder<Roster> rosters;

    private DataListHolder<Asset> assets;

    public MatchRelationships() {
    }

    public DataListHolder<Roster> getRosters() {
        return rosters;
    }

    public void setRosters(DataListHolder<Roster> rosters) {
        this.rosters = rosters;
    }

    public DataListHolder<Asset> getAssets() {
        return assets;
    }

    public void setAssets(DataListHolder<Asset> assets) {
        this.assets = assets;
    }
}
