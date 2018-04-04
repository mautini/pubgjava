package com.mautini.pubgjava.util;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsUtil {

    public static <T> List<T> filterType(List<? extends Object> objects, Class<T> filterClass) {
        return objects.stream()
                .filter(filterClass::isInstance)
                .map(filterClass::cast)
                .collect(Collectors.toList());
    }
}
