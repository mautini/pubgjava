package com.mautini.pubgjava.model.generic;

import com.google.gson.annotations.SerializedName;

public class SingleEntityResponse {

    @SerializedName("data")
    private Entity entity;

    public SingleEntityResponse() {
    }

    public Entity getEntity() {
        return entity;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }
}
