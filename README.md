# PUBG-Java
A Java wrapper for the PlayerUnknown's Battlegrounds (PUBG) API.

# Overview
PUBG-Java is a Java wrapper for the PUBG API. It provides an easy way to interact with the official API

**Note that this library is still in active development and no stable version has been released yet. The API can change at anytime.**

## Current functionalities
- Search for one or many players

## Api call example
To search for player(s) by name(s) :
```java
    public static final void main(String[] args) throws PubgClientException {
        PubgClient pubgClient = new PubgClient();
        List<Player> players = pubgClient.getPlayers("<shard>", "<playerName>");
        players.forEach(player -> LOGGER.info(player.getPlayerAttributes().getName()));
    }
```

## Configuration
The only thing you have to do is to set your PUBG Api Key (that you can find by registering here : https://developer.playbattlegrounds.com/) in the reference.conf file.
You can also provide an application.conf file as the project use typesafe for the configuration (https://github.com/lightbend/config).

## Links
- [PUBG developer portal](https://developer.playbattlegrounds.com/)