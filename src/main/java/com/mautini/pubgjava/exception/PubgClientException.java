package com.mautini.pubgjava.exception;

public class PubgClientException extends Exception {

    public PubgClientException() {
    }

    public PubgClientException(String message) {
        super(message);
    }

    public PubgClientException(String message, Throwable cause) {
        super(message, cause);
    }

    public PubgClientException(Throwable cause) {
        super(cause);
    }

    public PubgClientException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
