package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter {
    public AnalyticsCounter(List<String> symptoms) {
    }

    // The dictionary take symptoms as key and an integer as value for counting symptoms

    /**
     *
     * @param symptomList
     * List of symptoms as string
     *
     * @return a hash map of those symptoms : stringIntegerHashMap
     */
    public  Map<String, Integer> analytics(List<String> symptomList) {
        TreeMap<String, Integer> stringIntegerHashMap = new TreeMap<>();
        symptomList.stream().forEach(
            symptomName -> {
                stringIntegerHashMap.put(symptomName, stringIntegerHashMap.getOrDefault(symptomName, 0) + 1);
            }

        );
        return stringIntegerHashMap;
    }
}