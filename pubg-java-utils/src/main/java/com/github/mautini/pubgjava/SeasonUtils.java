package com.github.mautini.pubgjava;

import com.github.mautini.pubgjava.exception.PubgClientException;
import com.github.mautini.pubgjava.model.season.Season;

import java.util.List;

public class SeasonUtils {

    public static Season getCurrentSeason(List<Season> seasons) throws PubgClientException {
        Season currentSeason = null;

        for (Season season : seasons) {
            if (season.getSeasonAttributes() == null) {
                throw new PubgClientException("Season with id " + season.getId() + " doesn't have attributes");
            }

            if (Boolean.TRUE.equals(season.getSeasonAttributes().getCurrentSeason())) {
                if (currentSeason != null) {
                    throw new PubgClientException("More than one season marked as current season");
                } else {
                    currentSeason = season;
                }
            }
        }

        if (currentSeason == null) {
            throw new PubgClientException("No season marked as current season");
        }

        return currentSeason;
    }
}
