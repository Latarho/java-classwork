
/**
 * ClimbingClubRunner.java
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 * @author - I like how you just put placeholder values in here
 * @author - Why even include this header if it's basically empty?
 *
 */

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClimbingClubRunner {
	public static void main(String[] args) {

		// DO NOT ADJUST THE MAIN METHOD. PLEASE READ AND LEARN FROM THE EXAMPLES GIVEN
		// TO WRITE THE
		// CODE TO ANSWER THE SECTIONS BELOW.

		ClimbingClub hikerClub = new ClimbingClub();

		// These are examples of how to add data to the list
		hikerClub.addClimb("Draganski", 274);
		hikerClub.addClimb("Segal", 301);
		hikerClub.addClimb("Decraene", 98);
		hikerClub.addClimb("Liebforth", 274);

		// This is an example of how to print one field of a component in the arraylist.
		System.out.println(hikerClub.getList().get(0).getName());
		System.out.println(hikerClub.getList().get(0).getTime());
		System.out.println();
		System.out.println();
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		// Tests part A.
		// This method call gets data from a user and adds it to a list.
		GenerateList(hikerClub);

		// Tests part B
		// This method call prints all the contents of the list of climbing Info.
		PrintList(hikerClub);

		// Tests part C
		// This method call prints the number of unique peaks in the list
		System.out.println("The number of distinct peaks is: " + distinctPeakNames(hikerClub));

		// Tests part D
		// This sections finds and prints all the mountain peaks with a climb time less
		// than 100
		ArrayList<String> mountains = new ArrayList<String>();
		mountains = TimeLessThan100(hikerClub); // eww, hardcoded comparisons

		System.out.println();
		System.out.print("Peaks with climb time less than 100 are ");
		for (int j = 0; j < mountains.size(); j++) {
			System.out.print(mountains.get(j) + ",  ");
		}
		System.out.println();
	}

	// Part A. Student to complete.
	// This method asks the user for the number of data (n) to be added to the list,
	// It then gets (n) data set from the user and adds it to the list.
	// Use the example above to help you complete this method.

	public static void GenerateList(ClimbingClub hList) {
		int count = Integer.parseInt(JOptionPane.showInputDialog(null, "How many climbs should be added?"));
		for (int i = 0; i < count; i++) {
			String peak = JOptionPane.showInputDialog(null, "Input the name of the peak");
			int time;
			try {
				time = Integer.parseInt(JOptionPane.showInputDialog(null, "Input the length of the climb"));
			} catch (Exception e) {
				System.err.println("thats not a number try again uwu");
				time = 0;
				System.exit(1);
			}
			hList.addClimb(peak, time);
		}
	}

	// Part B. Student to complete.
	// This method prints all the contents of the list.
	// Use the example above to help you complete this method.
	public static void PrintList(ClimbingClub hList) {
		// you forgot to add the argument
		for (int i = 0; i < hList.getList().size(); i++) {
			// Java's getters and setters are trash, change my mind
			ClimbInfo climb = hList.getList().get(i);
			System.out.println(climb.getName() + ", " + climb.getTime());
		}
	}

	// Part C. Student to complete.
	// Returns the number of distinct names in the list of climbs.
	// This method searches the list and determines the total number of unique peaks
	// in the list.

	public static int distinctPeakNames(ClimbingClub hList) {
		ArrayList<String> known = new ArrayList<String>(); // Kotlin > Java, inferred typing ftw
		int result = 0; // ah yes very descriptive variable naming
		for (int i = 0; i < hList.getList().size(); i++) {
			if (known.indexOf(hList.getList().get(i).getName()) == -1) {
				result++;
				known.add(hList.getList().get(i).getName());
			}
		}
		return result;
	}

	// Part D. Student to complete.
	// This method searches the list of climb info and returns an arraylist of
	// strings
	// with all the peaks with a climb time less than 100.

	public static ArrayList<String> TimeLessThan100(ClimbingClub hList) {
		ArrayList<String> results = new ArrayList<String>();
		for (int i = 0; i < hList.getList().size(); i++) {
			if (results.indexOf(hList.getList().get(i).getName()) == -1 && hList.getList().get(i).getTime() < 100) {
				results.add(hList.getList().get(i).getName());
			}
		}
		return results;
	}
}