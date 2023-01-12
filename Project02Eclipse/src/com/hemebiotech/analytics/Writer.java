package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class Writer {

    // Method that takes a dictionary and the name of the output file for creating a file

    /**
     *
     * @param symptomsCounter
     * Counter for symptoms
     * @param outputFilePath
     * The output file to create that will have these results
     * @throws IOException
     * in case none file is given
     */
    public static void writer(Map<String, Integer> symptomsCounter, String outputFilePath ) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(outputFilePath);
            for (String symptom : symptomsCounter.keySet()) {
                fileWriter.write( symptom + " : " + symptomsCounter.get(symptom) + "\n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            fileWriter.flush();
            fileWriter.close();
        }
    }

}
