package ap562;

public class APCalendar {
	private static boolean isLeapYear(int year) {
		return false; // here so it compiles
	}

	public static int numberOfLeapYears(int year1, int year2) {
		int c = 0;
		for (int i = year1; i <= year2; ++i)
			if (isLeapYear(i))
				++c;
		return c;
	}

	private static int firstDayOfYear(int year) {
		return 0;
	}

	private static int dayOfYear(int month, int day, int year) {
		return 0;
	}

	public static int dayOfWeek(int month, int day, int year) {
		long dayIndex = dayOfYear(month, day, year);
		dayIndex += firstDayOfYear(year);
		dayIndex %= 7;
		return (int) dayIndex;
	}
}