import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/* WHAT THIS CLASS WILL OUTPUT:
 * The Index of the city is: 77
 * This index is average of NOWA and OILT, NEWP and OKCE, and so on. Can stop at 2 sets of stations.
 * (Lines 1-2)
 */
public class PosAvg {
	
	private String[] storedStations;
	
	/**
	 * Constructor for PosAvg
	 * @param stID
	 */
	public PosAvg(String stID) {
		String stationId = stID;
	}
	public void readIn (String fileName) throws IOException {
		BufferedReader readIn = new BufferedReader(new FileReader(fileName));
		
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
	
}
