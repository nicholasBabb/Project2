
/*	WHAT THIS CLASS WILL OUTPUT:
 *  Ascii Ceiling is 79
 *  Ascii Floor is 78
 *	Ascii Average is 79
 *	
 *  Letter Avg: O
 * (3-6)
 */
public class MesoInherit {
	
	private String stationId;
	private static char[] charArray;
			
	public MesoInherit(MesoStation mesoStation) {
		stationId = mesoStation.getStID();
	}
	
	// Calculate ASCII values. Inherited from MesoAbstract
	public int[] calAverage() {
		// To hold floor, ceiling, and average. Initialized to 3 slots as that is all that is needed
		int[] asciiAverages = new int[3];
		double averageValue = 0;
		//Splitting stationId into a char array to easily access each letter for conversion to ASCII.
		charArray = stationId.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			int asciiValue = (int) charArray[i];
			averageValue += (double) asciiValue;
		}
		// Divided by 4 because there are 4 letters in a Station ID.
		averageValue = (averageValue / 4.0);
		// Round to nearest value for Average
		asciiAverages[2] = (int) Math.round(averageValue);
		asciiAverages[1] = (int) Math.floor(averageValue);
		asciiAverages[0] = (int) Math.ceil(averageValue);
		return asciiAverages;
	}
	// Calculate average letter value. Inherited from MesoAbstract
	public static char letterAverage() {
		char letterAvg = charArray[0];
		return letterAvg;
	}

}
