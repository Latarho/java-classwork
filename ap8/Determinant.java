import javax.swing.JOptionPane;

public class Determinant {
	public static void main(final String args[]) {
		final String sizeStr = JOptionPane.showInputDialog("What size?");
		final int size = Integer.parseInt(sizeStr);
		final int[][] matrix = new int[size][size];
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				matrix[i][j] = (int) (Math.random() * 40) - 20;

		printArray(matrix);
		System.out.println("\nThe determinant = " + det(matrix));

	}

	public static int det(final int[][] A) {
		// Every recursive job can be done iteratively according to the Church-Turing
		// thesis, and recursion will generally be slower than iteration, since
		// recursion works on the call stack and has to create a scope for every
		// recursion.
		// No self-respecting business would ever have their software developers do
		// something inefficient and inelegant where a better solution is available and
		// affordable, right?
		final int rows = A.length;
		final int cols = A[0].length;
		int result = 0;
		for (int col = 0; col < cols; col++) {
			double add = 1;
			double sub = 1;
			for (int o = 0; o < rows; o++) {
				add *= A[o][betterMod(col + o, cols)];
				sub *= A[o][betterMod(col - o, cols)];
			}
			result += add;
			result -= sub;
		}
		return result;
	}

	public static void printArray(final int[][] A) {
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				final int num = A[i][j];
				if (num < -9)
					System.out.print(" ");
				else if (num < 0 || num > 9)
					System.out.print("  ");
				else
					System.out.print("   ");
				System.out.print(A[i][j]);
			}
			System.out.println();
		}
	}

	static int betterMod(final int a, final int b) {
		// Java is silly and returns the remainder instead of the modulus.
		// I've fixed that.
		int i = a % b;
		if (i < 0)
			i += b;
		return i;
	}
}