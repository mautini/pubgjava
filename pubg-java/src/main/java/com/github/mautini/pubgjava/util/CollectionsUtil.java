package com.github.mautini.pubgjava.util;

import java.util.List;
import java.util.stream.Collectors;

public class CollectionsUtil {

    /**
     * Filter in the list the elements with the provided class
     *
     * @return the list of elements in the list of type filterClass
     */
    public static <T> List<T> filterType(List<?> objects, Class<T> filterClass) {
        return objects.stream()
                .filter(filterClass::isInstance)
                .map(filterClass::cast)
                .collect(Collectors.toList());
    }
}
