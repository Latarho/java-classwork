package ap562;

public class APCalendar {
	private static boolean isLeapYear(int year) {
		return false; // aeiou
	}

	public static int numberOfLeapYears(int year1, int year2) {
		int c = 0;
		for (int i = year1; i <= year2; ++i) {
			if (isLeapYear(i))
				++c;
		}
		return c;
	}

	private static int firstDayOfYear(int year) {
		return 0;
	}

	private static int dayOfYear(int month, int day, int year) {
		return 0;
	}
}