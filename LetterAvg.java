import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* WHAT THIS CLASS WILL OUTPUT:
 * Total number of stations starting with letter 'O' is 4.
 * They are:
 * OILT
 * OKCE
 * OKEM
 * OKMU
 * (Line 7-End)
 */
public class LetterAvg {
	private char letterInput;
	private String[] storedStations = new String[1];
	public void letterAvg () {
		letterInput = MesoInherit.letterAverage();
		
		
	}
	
	public void readFile (String fileName) throws IOException {
		// Holds entire line
		String readLineStorage = "Default";
		// Holds substring of readLineStorage, station name specifically
		String readLineSubstring = "Default";
		int index = 0;
		// Beginning of Station ID after being trimmed.
		int beginString = 0;
		// End of Station ID after being trimmed.
		int endString = 3;
		// Start of stationIDs in Mesonet.txt.
		int startOfStations = 3;
		
		BufferedReader readIn = new BufferedReader(new FileReader(fileName));
		// Reading through first 3 lines to ensure it doesn't go into the array
		for (int i = 0; i < startOfStations; i++) {
			readLineStorage = readIn.readLine();
		}
		// Reading in the rest of the file
		readLineStorage = readIn.readLine();
		readLineStorage.trim();
		for (index = 0; readLineStorage != null; index++) {
			
			// Scanning in only the station name with a substring
			readLineSubstring = readLineStorage.substring(beginString, endString);
			
			// Determining if storedTerms can hold next term.
			if (storedStations.length <= index) {
				expandArray(storedStations);
			}
			storedStations[index] = readLineSubstring;
			readLineStorage = readIn.readLine();
			
		}
		readIn.close();
    }
	
	// Taken from Nicholas Babb - Project 1. Variable names and 
	// increase in array size changed to accommodate names in this project.
	public String[] expandArray (String[] array) {
		String[] temp = new String[array.length + 1];
		for (int i = 0; i < array.length; i++) {
			temp[i] = array[i];
		}
		array = temp;
		return array;
	}

}
