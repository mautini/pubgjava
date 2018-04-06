# PUBG-Java
A Java wrapper for the PlayerUnknown's Battlegrounds (PUBG) API.

# Overview
PUBG-Java is a Java wrapper for the PUBG API. It provides an easy way to interact with the official API

**Note that this library is still in active development and no stable version has been released yet. The API can change at anytime.**

## Current functionalities
- Get the status of the API
- Search for one or many players
- Search for a match

Currently the API doesn't support the telemetry

## Api call example
To search for player(s) by name(s) :
```java
    public static final void main(String[] args) throws PubgClientException {
        // Create a pubg client to make requests to the API
        PubgClient pubgClient = new PubgClient();

        // Get the status of the API
        Status status = pubgClient.getStatus();
        LOGGER.info(status.getStatusAttributes().getVersion());

        // Get a list of players using their names in-game
        List<Player> playerList = pubgClient.getPlayersByNames(<shard>, <name1>, <name2>, <name3>).getData();
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

        // Get a list of players using their id in-game
        playerList = pubgClient.getPlayersByIds(<shard>, <id1>, <id2>, <id3>).getData();
        LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

        // Get a single player using its id
        Player player = pubgClient.getPlayer(<shard>, <idPlayer>).getData();
        LOGGER.info(player.getPlayerAttributes().getName());
        LOGGER.info(player.getPlayerRelationships().getMatches().getData().get(0).getId());

        // Get a single match using its id
        MatchResponse match = pubgClient.getMatch(<shard>, <idMatch>);
        LOGGER.info(match.getData().getMatchAttributes().getGameMode());
    }
```

## Configuration
The only thing you have to do is to set your PUBG Api Key (that you can find by registering here : https://developer.playbattlegrounds.com/) in the reference.conf file.
You can also provide an application.conf file as the project use typesafe for the configuration (https://github.com/lightbend/config).

## Links
- [PUBG developer portal](https://developer.playbattlegrounds.com/)