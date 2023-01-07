package com.hemebiotech.analytics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
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



// first get input
//		BufferedReader reader = new BufferedReader (new FileReader("symptoms.txt"));
//		String line = reader.readLine();
//
//		int i = 0;	// set i to 0
//		int headCount = 0;	// counts headaches
//		while (line != null) {
//			i++;	// increment i
//			System.out.println("symptom from file: " + line);
//			if (line.equals("headache")) {
//				headCount++;
//				System.out.println("number of headaches: " + headCount);
//			}
//			else if (line.equals("rush")) {
//				rashCount++;
//			}
//			else if (line.contains("pupils")) {
//				pupilCount++;
//			}
//
//			line = reader.readLine();	// get another symptom
//		}
//
//