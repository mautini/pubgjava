# PUBG-Java
Java wrapper and utilities for the PlayerUnknown's Battlegrounds (PUBG) API.

# Overview
This repository provides two libraries :
- The first one, PUBG-Java is a Java wrapper for the PUBG API. It provides an easy way to interact with the official API.
- The second one, PUBG-Java Utils provides methods and tools to manipulate the data retrieved from the API. This package never call directly the official PUBG API.

**Note that theses libraries is still in active development and no stable version has been released yet. The API can change at anytime.**

This library supports the version 7.0.0 of the PUBG Java API

## Maven Dependencies
- For the Java Wrapper
```xml
<dependency>
    <groupId>com.github.mautini</groupId>
    <artifactId>pubg-java</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

- For the Utilities
```xml
<dependency>
    <groupId>com.github.mautini</groupId>
    <artifactId>pubg-java-utils</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

As the library is still in development (SNAPSHOT), you have to add the following lines in your pom.xml
```xml
<repositories>
    <repository>
        <id>snapshots-repo</id>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
        <releases>
            <enabled>false</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```
This will allow maven to download the artifact from the development Nexus.

## PUBG-Java

### Current functionalities
- Get the status of the API
- Search for one or many players
- Search for a match
- Access to the telemetry of a match
- List the seasons
- Get the stats of a player for a season
- Get information about tournaments

### Api call example
To search for player(s) by name(s) :
```java
public static final void main(String[] args) throws PubgClientException {
    // Create a pubg client to make requests to the API
    PubgClient pubgClient = new PubgClient();

    // Get the status of the API
    Status status = pubgClient.getStatus();
    LOGGER.info(status.getStatusAttributes().getVersion());

    // Get a list of players using their names in-game
    List<Player> playerList = pubgClient.getPlayersByNames(<platformRegion>, <name1>, <name2>, <name3>).getData();
    LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

    // Get a list of players using their id in-game
    playerList = pubgClient.getPlayersByIds(<platformRegion>, <id1>, <id2>, <id3>).getData();
    LOGGER.info(playerList.get(0).getPlayerAttributes().getName());

    // Get a single player using its id
    Player player = pubgClient.getPlayer(<platformRegion>, <idPlayer>).getData();
    LOGGER.info(player.getPlayerAttributes().getName());
    LOGGER.info(player.getPlayerRelationships().getMatches().getData().get(0).getId());

    // Get a single match using its id
    MatchResponse match = pubgClient.getMatch(<platformRegion>, <idMatch>);
    LOGGER.info(match.getData().getMatchAttributes().getGameMode());

    // Get the telemetry for a match
    Telemetry telemetry = pubgClient.getTelemetry(<telemetryLinkUrl>);
    LOGGER.info("{}", telemetry.getTelemetryEvents().size());
}
```

For more example, you can check out the PubgClientSample.java class

### Sync / Async
You can perform the request to the API either synchronously or asynchronously using the classes PubgClient or PubgClientAsync

### Rate Limit
The PUBG API has a rate limit (currently it's 10 requests / minute). You can get information about this limit using the methods :
```java
getRateLimitRemaining()
getRateLimit()
getRateLimitReset()
```
in your PUBG client.

### Configuration
The only thing you have to do is to set your PUBG Api Key (that you can find by registering here : https://developer.playbattlegrounds.com/) in the reference.conf file.
You can also provide an application.conf file as the project use typesafe for the configuration (https://github.com/lightbend/config).

## PUBG-Java utils

### Functionalities
#### Match
- Get the telemetry link for the match
- Get all the participants of the match
- Get all the rosters of the match
- Get the winner (roster) of the match
- Get the participants of the winning roster (winners)
#### Player
- Get the list of the match ids for a player
#### Rosters
- Get the ids of the participant in a roster

### Known issues
- Sometimes the PUBG API doesn't return a winner (roster with the "won" attribute set to true)

## Links
- [PUBG developer portal](https://developer.playbattlegrounds.com/)