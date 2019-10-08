import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* WHAT THIS CLASS WILL OUTPUT:
 * The Index of the city is: 77
 * This index is average of NOWA and OILT, NEWP and OKCE, and so on. Can stop at 2 sets of stations.
 * (Lines 1-2)
 */
public class PosAvg {
	
	// Stores stations read in through readFile, initialized with 1 "slot"
	private String[] storedStations = new String[1];
	
	//Stores sets of stations whose indexes average out to become the index of stID, initialized to 1 "slot"
	private String[] averageStations = new String[1];
	/**
	 * Constructor for PosAvg
	 * @param stID
	 */
	public PosAvg(String stID) {
		String stationId = stID;
	}
	// Taken from Nicholas Babb - Project 1. Variable names and method functions were modified
	// to accommodate the nature of this project, as well as suggestions given during code review.
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
		BufferedReader readIn = new BufferedReader(new FileReader(fileName));
		// Reading through first 3 lines to ensure it doesn't go into the array
		readLineStorage = readIn.readLine();
		readLineStorage = readIn.readLine();
		readLineStorage = readIn.readLine();
		// Reading in the rest of the file
		readLineStorage = readIn.readLine();
		readLineStorage.trim();
		for (index = 0; readLineStorage != null; index++) {
			
			// Scanning in only the station name with a substring
			readLineSubstring = readLineStorage.substring(beginString, endString);
			
			// Determining if storedTerms can hold next term.
			if (storedStations.length <= index) {
				expandArray();
			}
			storedStations[index] = readLineSubstring;
			readLineStorage = readIn.readLine();
			
		}
		readIn.close();
    }
	
	// Taken from Nicholas Babb - Project 1. Variable names and 
	// increase in array size changed to accommodate names in this project.
	public void expandArray () {
		String[] temp = new String[this.storedStations.length + 1];
		for (int i = 0; i < storedStations.length; i++) {
			temp[i] = storedStations[i];
		}
		this.storedStations = temp;
	}
	
	public int indexOfStation (String stationId) {
		int indexOfStation = 0;
		for (int i = 0; i < storedStations.length; i++) {
			if (stationId.equalsIgnoreCase(storedStations[i])) {
				indexOfStation = i;
				return indexOfStation;
			}
		}
		return -1;
	}
	
	public int stationAveragePositions (int indexOfStation) {
		// Will cover indexes ahead of indexOfStation
		int forwardIndex = indexOfStation + 1;
		// Will cover indexes behind indexOfStation
		int backwardIndex = indexOfStation - 1;
		// Will contain the pairing of stations whose indexes average out to become indexOfStation
		String averageStationPair = "Default";
		for (int i = 1; storedStations[forwardIndex] == null || storedStations[backwardIndex] == null;) {
			
		}
			
	}
	
}