/**
 * Sorts
 */
public class Sorts {

	public static void main(String[] args) {
		System.out.println("Running ten bubble sorts...");
		int[] reads = new int[10];
		int[] writes = new int[10];
		long[] times = new long[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Bubble sort " + i + "...");
			ProfiledList<Integer> result = bubble(1024);
			reads[i] = result.reads;
			writes[i] = result.writes;
			times[i] = result.elapsed;
		}
		float avgReads = 0;
		for (int i = 0; i < reads.length; i++)
			avgReads += reads[i];
		avgReads /= reads.length;
		System.out.println("Average bubble read count: " + avgReads);
		float avgWrites = 0;
		for (int i = 0; i < writes.length; i++)
			avgWrites += writes[i];
		avgWrites /= writes.length;
		System.out.println("Average bubble write count: " + avgWrites);
		float avgTime = 0;
		for (int i = 0; i < reads.length; i++)
			avgTime += times[i];
		avgTime /= times.length;
		System.out.println("Average bubble time: " + avgTime);
	}

	static ProfiledList<Integer> bubble(int length) {
		ProfiledList<Integer> result = new ProfiledList<Integer>();
		for (int i = 0; i < length; i++) {
			result.add((int) Math.floor(Math.random() * result.size()), i);
		}
		result.reads = 0; // Clear profiling data for the actual test.
		result.writes = 0;
		result.startTimer();
		boolean dirty = false;
		do {
			for (int i = 0; i < length - 1; i++) {
				if (result.get(i) > result.get(i + 1)) {
					Integer tmp = result.get(i);
					result.set(i, result.get(i + 1));
					result.set(i + 1, tmp);
				}
			}
		} while (dirty);
		result.endTimer();
		return result;
	}
}