package com.github.mautini.pubgjava.model.generic;

public class DataHolder<T> {

    private T data;

    public DataHolder() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
