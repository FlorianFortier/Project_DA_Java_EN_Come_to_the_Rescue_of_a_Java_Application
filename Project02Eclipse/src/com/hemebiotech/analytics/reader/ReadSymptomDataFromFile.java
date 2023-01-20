package com.hemebiotech.analytics.reader;

import com.hemebiotech.analytics.reader.ISymptomReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Simple brute force implementation
 * That reads a file
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}

	/**
	 *
	 * @return The list of symptoms the input file contains
	 */
	@Override
	public List<String> getSymptoms() throws IOException {
		ArrayList<String> result = new ArrayList<String>();
		
		if (filepath != null) {
			BufferedReader reader = null;
			try {
				reader = new BufferedReader(new FileReader(filepath));
				String line = reader.readLine();

				while (line != null) {
					result.add(line);
					line = reader.readLine();
				}
				reader.close();
			} catch (IOException e) {
				if (reader != null) {
					reader.close();
				}
				e.printStackTrace();
			}
		}
		
		return result;
	}

}
