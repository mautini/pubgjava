package com.mautini.pubgjava.model.generic;

import java.util.ArrayList;
import java.util.List;

public class DataListHolder<T> {

    private List<T> data;

    public DataListHolder() {
        data = new ArrayList<>();
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }
}
