
/**
 * Sorts
 */
public class Sorts {

	static int COUNT = 10; // Number of samples to run
	static int LENGTH = 4096; // Length of the arrays

	public static void main(String[] args) {
		if (args.length > 0) {
			// yes, I did implement user input. here it is. you can even determine how many
			// tests get run on each sort.
			COUNT = Integer.parseInt(args[0]);
			LENGTH = Integer.parseInt(args[1]);
		}
		System.out.println("trialCount: " + COUNT);
		System.out.println("arrayLength: " + LENGTH);
		// System.err.println("Generating ten 4096-element arrays...");
		// stderr is used for logging as per unix best practices to allow users to
		// easily pipe results to a file. (this outputs valid yaml to stdout)
		Integer arrays[][] = new Integer[COUNT][LENGTH];
		for (int array = 0; array < arrays.length; array++) {
			for (int i = 0; i < arrays[array].length; i++) {
				arrays[array][i] = (int) Math.round(Math.random() * LENGTH);
			}
		}
		// System.err.println("Running bubble sorts...");
		int[] reads = new int[COUNT];
		int[] writes = new int[COUNT];
		long[] times = new long[COUNT];
		for (int i = 0; i < arrays.length; i++) {
			// System.err.println("Bubble sort " + i + "...");
			ProfiledList<Integer> result = bubble(arrays[i]);
			reads[i] = result.reads;
			writes[i] = result.writes;
			times[i] = result.elapsed;
		}
		float avgReads = 0;
		for (int i = 0; i < reads.length; i++)
			avgReads += reads[i];
		avgReads /= reads.length;
		System.out.println("bubbleRead: " + avgReads);
		float avgWrites = 0;
		for (int i = 0; i < writes.length; i++)
			avgWrites += writes[i];
		avgWrites /= writes.length;
		System.out.println("bubbleWrite: " + avgWrites);
		float avgTime = 0;
		for (int i = 0; i < reads.length; i++)
			avgTime += times[i];
		avgTime /= times.length;
		System.out.println("bubbleCompute: " + avgTime);
		// System.err.println("Running selection sorts...");
		for (int i = 0; i < arrays.length; i++) {
			// System.err.println("Selection sort " + i + "...");
			ProfiledList<Integer> result = selection(arrays[i]);
			reads[i] = result.reads;
			writes[i] = result.writes;
			times[i] = result.elapsed;
		}
		avgReads = 0;
		for (int i = 0; i < reads.length; i++)
			avgReads += reads[i];
		avgReads /= reads.length;
		System.out.println("selectionRead: " + avgReads);
		avgWrites = 0;
		for (int i = 0; i < writes.length; i++)
			avgWrites += writes[i];
		avgWrites /= writes.length;
		System.out.println("selectionWrite: " + avgWrites);
		avgTime = 0;
		for (int i = 0; i < reads.length; i++)
			avgTime += times[i];
		avgTime /= times.length;
		System.out.println("selectionCompute: " + avgTime);
		// System.err.println("Running insertion sorts...");
		for (int i = 0; i < arrays.length; i++) {
			// System.err.println("Insertion sort " + i + "...");
			ProfiledList<Integer> result = insertion(arrays[i]);
			reads[i] = result.reads;
			writes[i] = result.writes;
			times[i] = result.elapsed;
		}
		avgReads = 0;
		for (int i = 0; i < reads.length; i++)
			avgReads += reads[i];
		avgReads /= reads.length;
		System.out.println("insertionRead: " + avgReads);
		avgWrites = 0;
		for (int i = 0; i < writes.length; i++)
			avgWrites += writes[i];
		avgWrites /= writes.length;
		System.out.println("insertionWrite: " + avgWrites);
		avgTime = 0;
		for (int i = 0; i < reads.length; i++)
			avgTime += times[i];
		avgTime /= times.length;
		System.out.println("insertionCompute: " + avgTime);
	}

	static ProfiledList<Integer> bubble(Integer[] array) {
		ProfiledList<Integer> result = new ProfiledList<Integer>();
		result.fill(array);
		result.startTimer();
		boolean dirty = false;
		do {
			dirty = false;
			for (int i = 0; i < result.size() - 1; i++) {
				if (result.get(i) > result.get(i + 1)) {
					Integer tmp = result.get(i);
					result.set(i, result.get(i + 1));
					result.set(i + 1, tmp);
					dirty = true;
				}
			}
		} while (dirty);
		result.endTimer();
		return result;
	}

	static ProfiledList<Integer> selection(Integer[] array) {
		ProfiledList<Integer> result = new ProfiledList<Integer>();
		result.fill(array);
		result.startTimer();
		for (int sortedIndices = 0; sortedIndices < result.size(); sortedIndices++) {
			int minIndex = -1;
			int minValue = 0;
			for (int i = sortedIndices; i < result.size(); i++) {
				int val = result.get(i);
				if (val < minValue || minIndex == -1) {
					minValue = val;
					minIndex = i;
				}
			}
			result.remove(minIndex);
			result.add(sortedIndices, minValue);
		}
		result.endTimer();
		return result;
	}

	static ProfiledList<Integer> insertion(Integer[] array) {
		ProfiledList<Integer> result = new ProfiledList<Integer>();
		result.fill(array);
		result.startTimer();
		for (int i = 1; i < result.size(); ++i) {
			int val = result.get(i);
			if (val < result.get(i - 1)) { // This element isn't sorted
				int tgt = i - 1;
				for (; tgt > 0; tgt--)
					if (result.get(tgt - 1) <= val && result.get(tgt) >= val)
						break;
				result.remove(i);
				result.add(tgt, val);
			}
		}
		result.endTimer();
		return result;
	}

	static int isSorted(ProfiledList<Integer> list) {
		int reads = list.reads;
		int writes = list.writes;
		for (int i = 1; i < list.size() - 1; ++i) {
			if (list.get(i) < list.get(i - 1) || list.get(i) > list.get(i + 1)) {
				return i;
			}
		}
		list.reads = reads;
		list.writes = writes;
		return -1;
	}
}