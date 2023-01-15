package com.hemebiotech.analytics.writer;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriterDataFromFIle implements IWriter {

    @Override
    public void write(Map<String, Integer> symptomsCounter, String outputFilePath) throws IOException {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(outputFilePath);
            for (String symptom : symptomsCounter.keySet()) {
                fileWriter.write( symptom + " : " + symptomsCounter.get(symptom) + "\n");

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if  (fileWriter != null) {
                fileWriter.flush();
                fileWriter.close();
            }
        }
    }
}
