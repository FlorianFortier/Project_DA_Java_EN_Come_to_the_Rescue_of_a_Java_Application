package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AnalyticsCounter {

    // The dictionary take symptoms as key and an integer as value for counting symptoms

    /**
     *
     * @param symptomList
     * List of symptoms as string
     *
     * @return a hash map of those symptoms : stringIntegerHashMap
     */
    public static Map<String, Integer> analytics(List<String> symptomList) {
        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
        symptomList.stream().forEach(
            symptomName -> {
                stringIntegerHashMap.put(symptomName, stringIntegerHashMap.getOrDefault(symptomName, 0) + 1);
            }

        );
        return stringIntegerHashMap;
    }
}