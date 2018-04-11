package com.mautini.pubgjava.model.generic;

public abstract class Entity {

    private String type;

    private String id;

    public Entity() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
