package com.hemebiotech.analytics;

import java.io.IOException;

public class Launcher {
    /**
     *
     * @throws Exception
     * Throws any Related execution error that may occur
     */
    public static void main(String[] args) throws Exception {

        // Execute the program and counts the time that it takes
        long start = System.nanoTime();
        process();
        long elapsedTime = System.nanoTime() - start;
        double seconds = (double)elapsedTime / 1_000_000_000.0;

        System.out.println("File has been generated in "+seconds+"s");
    }

    /**
     *
     * @throws IOException
     * Throw an error if output file or input file can't be read/write or can't be found (invalidPath)
     */
    public  static void process() throws IOException {

        // Calls to file reader, counter and writer
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
        AnalyticsCounter.analytics(readSymptomDataFromFile.getSymptoms());
        Writer.writer(AnalyticsCounter.analytics(readSymptomDataFromFile.getSymptoms()), "Project02Eclipse/resources/results.out");

    }
}
