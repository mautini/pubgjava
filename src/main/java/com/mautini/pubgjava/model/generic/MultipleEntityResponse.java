package com.mautini.pubgjava.model.generic;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class MultipleEntityResponse {

    @SerializedName("data")
    private List<Entity> entities;

    public MultipleEntityResponse() {
        entities = new ArrayList<>();
    }

    public List<Entity> getEntities() {
        return entities;
    }

    public void setEntities(List<Entity> entities) {
        this.entities = entities;
    }
}
