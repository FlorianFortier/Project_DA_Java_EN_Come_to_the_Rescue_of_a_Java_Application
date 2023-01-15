package com.hemebiotech.analytics.writer;

import java.io.IOException;
import java.util.Map;

public interface IWriter {

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
     void write(Map<String, Integer> symptomsCounter, String outputFilePath) throws IOException;

}
