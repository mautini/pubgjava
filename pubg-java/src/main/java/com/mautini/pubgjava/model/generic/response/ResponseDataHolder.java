package com.mautini.pubgjava.model.generic.response;

import com.mautini.pubgjava.model.Links;
import com.mautini.pubgjava.model.generic.DataHolder;

/**
 * Represent a response from the pubg api containing a single object
 */
public class ResponseDataHolder<T> extends DataHolder<T> {

    private Links links;

    public ResponseDataHolder() {
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
