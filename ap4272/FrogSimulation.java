package ap4272;

public class FrogSimulation {
	private int goal;
	private int hops;

	public FrogSimulation(int g, int h) {
		goal = g;
		hops = h;
	}

	private int hopD() {
		return 0;
	}

	public boolean simulate() {
		int c = 0;
		for (int i = 0; i < hops; ++i) {
			c += hopD();
			if (c > goal)
				return true;
			if (c < 0)
				return false;
		}
		return false;
	}

	public double runSimulations(int n) {
		int c = 0;
		for (int i = 0; i < n; ++i)
			if (simulate())
				++c;
		return c / n;
	}
}