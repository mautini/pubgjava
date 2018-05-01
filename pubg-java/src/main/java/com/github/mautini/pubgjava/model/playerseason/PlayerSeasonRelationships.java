package com.github.mautini.pubgjava.model.playerseason;

import com.github.mautini.pubgjava.model.generic.DataHolder;
import com.github.mautini.pubgjava.model.generic.DataListHolder;
import com.github.mautini.pubgjava.model.match.Match;
import com.github.mautini.pubgjava.model.player.Player;
import com.github.mautini.pubgjava.model.season.Season;
import com.google.gson.annotations.SerializedName;

public class PlayerSeasonRelationships {

    @SerializedName("matchesDuoFPP")
    private DataListHolder<Match> matchesDuoFpp;

    private DataListHolder<Match> matchesSquad;

    @SerializedName("matchesSquadFPP")
    private DataListHolder<Match> matchesSquadFpp;

    private DataHolder<Season> season;

    private DataHolder<Player> player;

    private DataListHolder<Match> matchesSolo;

    @SerializedName("matchesSoloFPP")
    private DataListHolder<Match> matchesSoloFpp;

    private DataListHolder<Match> matchesSoloDuo;

    public PlayerSeasonRelationships() {
    }

    public DataListHolder<Match> getMatchesDuoFpp() {
        return matchesDuoFpp;
    }

    public void setMatchesDuoFpp(DataListHolder<Match> matchesDuoFpp) {
        this.matchesDuoFpp = matchesDuoFpp;
    }

    public DataListHolder<Match> getMatchesSquad() {
        return matchesSquad;
    }

    public void setMatchesSquad(DataListHolder<Match> matchesSquad) {
        this.matchesSquad = matchesSquad;
    }

    public DataListHolder<Match> getMatchesSquadFpp() {
        return matchesSquadFpp;
    }

    public void setMatchesSquadFpp(DataListHolder<Match> matchesSquadFpp) {
        this.matchesSquadFpp = matchesSquadFpp;
    }

    public DataHolder<Season> getSeason() {
        return season;
    }

    public void setSeason(DataHolder<Season> season) {
        this.season = season;
    }

    public DataHolder<Player> getPlayer() {
        return player;
    }

    public void setPlayer(DataHolder<Player> player) {
        this.player = player;
    }

    public DataListHolder<Match> getMatchesSolo() {
        return matchesSolo;
    }

    public void setMatchesSolo(DataListHolder<Match> matchesSolo) {
        this.matchesSolo = matchesSolo;
    }

    public DataListHolder<Match> getMatchesSoloFpp() {
        return matchesSoloFpp;
    }

    public void setMatchesSoloFpp(DataListHolder<Match> matchesSoloFpp) {
        this.matchesSoloFpp = matchesSoloFpp;
    }

    public DataListHolder<Match> getMatchesSoloDuo() {
        return matchesSoloDuo;
    }

    public void setMatchesSoloDuo(DataListHolder<Match> matchesSoloDuo) {
        this.matchesSoloDuo = matchesSoloDuo;
    }
}

