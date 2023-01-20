package com.hemebiotech.analytics;

import com.hemebiotech.analytics.reader.ReadSymptomDataFromFile;
import com.hemebiotech.analytics.writer.WriterDataFromFIle;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * Class that execute the program
 */
public class Launcher {
    /**
     * @throws Exception Throws any Related execution error that may occur
     */
    public static void main(String[] args) throws Exception {

        // Execute the program and counts the time that it takes
        long start = System.nanoTime();
        process();
        long elapsedTime = System.nanoTime() - start;
        double seconds = (double) elapsedTime / 1_000_000_000.0;

        System.out.println("File has been generated in " + seconds + "s");
    }

    /**
     * @throws IOException Throw an error if output file or input file can't be read/write or can't be found (invalidPath)
     */
    public static void process() throws IOException {

        // Calls to file reader, counter and writer
        ReadSymptomDataFromFile readSymptomDataFromFile = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
        List<String> symptoms = readSymptomDataFromFile.getSymptoms();

        AnalyticsCounter analyticsCounter = new AnalyticsCounter(symptoms);
        Map<String, Integer> analytics = analyticsCounter.analytics(symptoms);

        WriterDataFromFIle outputWriter = new WriterDataFromFIle();
        outputWriter.write(analytics, "Project02Eclipse/resources/results.out");

    }
}
