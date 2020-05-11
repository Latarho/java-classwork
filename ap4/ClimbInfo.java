package ap4;

/**
 * ClimbInfo.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 */

public class ClimbInfo {
	private String peakName;
	private int time;

	/*
	 * Creates Climbo object with name peakName and time climbTime. PeakName : the
	 * name of the mountain peak climbTime the number of minutes taken to complete
	 * the climb
	 */
	public ClimbInfo(String pName, int climbTime) {
		peakName = pName;
		time = climbTime;
	}

	/*
	 * Return the name of the mountain peak
	 */
	public String getName() {
		return peakName;
	}

	/*
	 * Return the number of minutes taken to complete the climb
	 */
	public int getTime() {
		return time;
	}

}