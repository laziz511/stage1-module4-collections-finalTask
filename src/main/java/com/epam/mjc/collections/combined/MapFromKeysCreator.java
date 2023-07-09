package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> lengthMap = new HashMap<>();

        for (String key : sourceMap.keySet()) {
            int length = key.length();
            Set<String> set = lengthMap.getOrDefault(length, new HashSet<>());
            set.add(key);
            lengthMap.put(length, set);
        }

        return lengthMap;
    }
}
