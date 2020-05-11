package ap4;

/**
 * ClimbingClub.java  2/9/2015
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 */

import java.util.ArrayList;

public class ClimbingClub {
	/*
	 * The list of climbs completed by members of the club.
	 */
	private ArrayList<ClimbInfo> climbList;

	/* Creates a new ClimbingClub object */
	public ClimbingClub() {
		climbList = new ArrayList<ClimbInfo>();
	}

	/*
	 * Adds a new climb with name peakNAme and time ClimbTime to the list of climbs.
	 * Alphabetical order is determined by the compareTo method of the String class.
	 * peakNAme the name of the mountain peak climbed climbTime the number of
	 * minutes taken to complete the climb. Note: Entires in climbList are in
	 * alphabetical oreder by name.
	 */
	public void addClimb(String peakName, int climbTime) {
		ClimbInfo climb = new ClimbInfo(peakName, climbTime);
		climbList.add(climb);
	}

	public ArrayList<ClimbInfo> getList() {
		return climbList;
	}

}