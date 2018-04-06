package com.mautini.pubgjava.model.generic.response;

import com.mautini.pubgjava.model.Links;
import com.mautini.pubgjava.model.generic.DataListHolder;

/**
 * Represent a response from the pubg api containing a list of object
 */
public class ResponseDataListHolder<T> extends DataListHolder<T> {

    private Links links;

    public ResponseDataListHolder() {
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
