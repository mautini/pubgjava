package com.github.mautini.pubgjava.api;

import com.github.mautini.pubgjava.exception.PubgClientException;

public interface ResponseCallback<T> {

    void onResponse(T t);

    void onError(PubgClientException pubgClientException);
}
