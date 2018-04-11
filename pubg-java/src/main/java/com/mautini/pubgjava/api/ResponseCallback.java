package com.mautini.pubgjava.api;

import com.mautini.pubgjava.exception.PubgClientException;

public interface ResponseCallback<T> {

    void onResponse(T t);

    void onError(PubgClientException pubgClientException);
}
