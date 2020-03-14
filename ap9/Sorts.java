import java.util.ArrayList;

/**
 * Sorts
 */
public class Sorts {

	static int COUNT = 10; // Number of samples to run
	static int LENGTH = 4096; // Length of the arrays

	public static void main(final String[] args) {
		if (args.length > 0) {
			// yes, I did implement user input. here it is. you can even determine how many
			// tests get run on each sort.
			COUNT = Integer.parseInt(args[0]);
			LENGTH = Integer.parseInt(args[1]);
		}
		System.out.println("trialCount: " + COUNT);
		System.out.println("arrayLength: " + LENGTH);
		final Integer arrays[][] = new Integer[COUNT][LENGTH];
		for (int array = 0; array < arrays.length; array++) {
			for (int i = 0; i < arrays[array].length; i++) {
				arrays[array][i] = (int) Math.round(Math.random() * LENGTH);
			}
		}
		// System.err.println("Running bubble sorts...");
		final int[] reads = new int[COUNT];
		final int[] writes = new int[COUNT];
		final long[] times = new long[COUNT];
		for (int i = 0; i < arrays.length; i++) {
			// System.err.println("Bubble sort " + i + "...");
			final ProfiledList<Integer> result = bubble(arrays[i]);
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
			final ProfiledList<Integer> result = selection(arrays[i]);
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
			final ProfiledList<Integer> result = insertion(arrays[i]);
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

		for (int i = 0; i < arrays.length; i++) {
			// System.err.println("Insertion sort " + i + "...");
			final ProfiledList<Integer> result = merge(arrays[i]);
			reads[i] = result.reads;
			writes[i] = result.writes;
			times[i] = result.elapsed;
		}
		avgReads = 0;
		for (int i = 0; i < reads.length; i++)
			avgReads += reads[i];
		avgReads /= reads.length;
		System.out.println("mergeRead: " + avgReads);
		avgWrites = 0;
		for (int i = 0; i < writes.length; i++)
			avgWrites += writes[i];
		avgWrites /= writes.length;
		System.out.println("mergeWrite: " + avgWrites);
		avgTime = 0;
		for (int i = 0; i < reads.length; i++)
			avgTime += times[i];
		avgTime /= times.length;
		System.out.println("mergeCompute: " + avgTime);
	}

	static public String report(int c, int l) {
		// I really need to stop listening to music while I write software, I end up
		// jamming out instead of working.
		COUNT = c;
		LENGTH = l;
		// Generate l arrays.
		final Integer arrays[][] = new Integer[COUNT][LENGTH];
		for (int array = 0; array < arrays.length; array++) {
			for (int i = 0; i < arrays[array].length; i++) {
				arrays[array][i] = (int) Math.round(Math.random() * LENGTH);
			}
		}

		String out = "";
		ArrayList<ProfiledList<Integer>> res = new ArrayList<ProfiledList<Integer>>();
		for (int i = 0; i < c; i++) {
			for (int alg = 0; alg < 4; alg++) {
				switch (alg) {
					case 0: {
						res.add(alg, bubble(arrays[i]));
						break;
					}
					case 1: {
						res.add(alg, selection(arrays[i]));
						break;
					}
					case 2: {
						res.add(alg, insertion(arrays[i]));
						break;
					}
					case 3: {
						res.add(alg, merge(arrays[i]));
						break;
					}
				}
			}
		}
		for (int i = 0; i < res.size(); i++) {
			String algName = (new String[] { "bubble", "selection", "insertion", "merge" })[i % 4];
			out += LENGTH + "," + algName + "-" + "reads," + res.get(i).reads + "\n";
			out += LENGTH + "," + algName + "-" + "writes," + res.get(i).writes + "\n";
			out += LENGTH + "," + algName + "-" + "elapsed," + res.get(i).elapsed + "\n";
			// out += algName + "," + LENGTH + "," + res.get(i).reads + "," +
			// res.get(i).writes + "," + res.get(i).elapsed + "\n";
		}

		return out;
	}

	static ProfiledList<Integer> bubble(final Integer[] array) {
		final ProfiledList<Integer> result = new ProfiledList<Integer>();
		result.fill(array);
		result.startTimer();
		boolean dirty = false;
		do {
			dirty = false;
			for (int i = 0; i < result.size() - 1; i++) {
				if (result.get(i) > result.get(i + 1)) {
					final Integer tmp = result.get(i);
					result.set(i, result.get(i + 1));
					result.set(i + 1, tmp);
					dirty = true;
				}
			}
		} while (dirty);
		result.endTimer();
		return result;
	}

	static ProfiledList<Integer> selection(final Integer[] array) {
		final ProfiledList<Integer> result = new ProfiledList<Integer>();
		result.fill(array);
		result.startTimer();
		for (int sortedIndices = 0; sortedIndices < result.size(); sortedIndices++) {
			int minIndex = -1;
			int minValue = 0;
			for (int i = sortedIndices; i < result.size(); i++) {
				final int val = result.get(i);
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

	static ProfiledList<Integer> insertion(final Integer[] array) {
		final ProfiledList<Integer> result = new ProfiledList<Integer>();
		result.fill(array);
		result.startTimer();
		for (int i = 1; i < result.size(); ++i) {
			final int val = result.get(i);
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

	static ProfiledList<Integer> merge(final Integer[] array) {
		final ProfiledList<Integer> result = new ProfiledList<Integer>();
		result.fill(array);
		result.startTimer();
		// I realized I wasn't supposed to write these myself,
		// so I'm just going to adapt yours.
		ms(result, 0, result.size());
		result.endTimer();
		return result;
	}

	private static void ms(ProfiledList<Integer> data, int first, int n) {
		int n1; // Size of the first half of the array
		int n2; // Size of the second half of the array
		if (n > 1) {
			// Compute sizes of the two halves
			n1 = n / 2;
			n2 = n - n1;
			ms(data, first, n1); // Sort data[first] through data[first+n1-1]
			ms(data, first + n1, n2); // Sort data[first+n1] to the end

			// Merge the two sorted halves.
			m(data, first, n1, n2);
		}
	}

	private static void m(ProfiledList<Integer> data, int first, int n1, int n2) {
		int[] temp = new int[n1 + n2]; // Allocate the temporary array
		int copied = 0; // Number of elements copied from data to temp
		int copied1 = 0; // Number copied from the first half of data
		int copied2 = 0; // Number copied from the second half of data
		int i; // Array index to copy from temp back into data
		// Merge elements, copying from two halves of data to the temporary array.
		while ((copied1 < n1) && (copied2 < n2)) {
			if (data.get(first + copied1) < data.get(first + n1 + copied2))
				temp[copied++] = data.get(first + (copied1++));
			else
				temp[copied++] = data.get(first + n1 + (copied2++));
		}
		// Copy any remaining entries in the left and right subarrays.
		while (copied1 < n1)
			temp[copied++] = data.get(first + (copied1++));
		while (copied2 < n2)
			temp[copied++] = data.get(first + n1 + (copied2++));
		// Copy from temp back to the data array.
		for (i = 0; i < n1 + n2; i++)
			data.set(first + i, temp[i]);
	}

	static int isSorted(final ProfiledList<Integer> list) {
		final int reads = list.reads;
		final int writes = list.writes;
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