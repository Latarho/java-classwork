package ap562;

public class StepTracker {

	private int[] days = new int[0];
	private int threshold = 0;

	public StepTracker(int t) {
		threshold = t;
	}

	public int activeDays() {
		int c = 0;
		for (int i : days)
			if (i >= threshold)
				++c;
		return c;
	}

	public float averageSteps() {
		int c = 0;
		for (int i : days)
			c += i;
		c /= days.length;
		return c;
	}

	public void addDailySteps(int s) {
		int[] newDays = new int[days.length + 1];
		for (int i = 0; i < days.length; ++i)
			newDays[i] = days[i];
		newDays[days.length] = s;
		days = newDays;
	}
}