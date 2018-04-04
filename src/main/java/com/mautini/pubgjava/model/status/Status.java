package com.mautini.pubgjava.model.status;

import com.google.gson.annotations.SerializedName;
import com.mautini.pubgjava.model.generic.Entity;

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
