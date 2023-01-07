package com.hemebiotech.analytics;

public class Launcher {
    public static void main(String[] args) throws Exception {
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
        AnalyticsCounter.analytics(readSymptomDataFromFile.getSymptoms());
        Writer.writer(AnalyticsCounter.analytics(readSymptomDataFromFile.getSymptoms()), "Project02Eclipse/resources/results.out");
    }
}
