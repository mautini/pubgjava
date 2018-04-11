package com.github.mautini.pubgjava.model.status;

import com.github.mautini.pubgjava.model.generic.Entity;
import com.google.gson.annotations.SerializedName;
import com.github.mautini.pubgjava.model.generic.Entity;

public class Status extends Entity {

    @SerializedName("attributes")
    private StatusAttributes statusAttributes;

    public Status() {
    }

    public StatusAttributes getStatusAttributes() {
        return statusAttributes;
    }

    public void setStatusAttributes(StatusAttributes statusAttributes) {
        this.statusAttributes = statusAttributes;
    }
}
