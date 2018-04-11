package com.github.mautini.pubgjava.model.generic.response;

import com.github.mautini.pubgjava.model.Links;
import com.github.mautini.pubgjava.model.generic.DataHolder;
import com.github.mautini.pubgjava.model.Links;
import com.github.mautini.pubgjava.model.generic.DataHolder;

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
