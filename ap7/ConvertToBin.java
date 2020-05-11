package ap7;

/**
 * ConvertToBin
 * 
 */
public class ConvertToBin {

	static String[] argv;

	public static void main(String[] args) {
		int mode = Integer.parseInt(args[0]);
		switch (mode) {
			case 0: {
				System.out.println("Running in mode 0, converting argument 1 to bin.");
				convertToBin(Integer.parseInt(args[1]));
				break;
			}
			case 1: {
				System.out.println("Running on mode 1, multiplying argument 1 by five.");
				System.out.println(multiply(Integer.parseInt(args[1]), 5, 0));
				break;
			}
			case 2: {
				System.out.println("Running on mode 2, multiplying arg 1 by arg 2.");
				System.out.println(multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2]), 0));
				break;
			}
			default: {
				System.out.println(
						"Pass some arguments. This exit state is caused by user error, not by a mistake on the programmer's part. Do not e-mail me a screenshot of this error message calling it a syntax error.");
				System.exit(1);
			}
		}
	}

	/**
	 * Recursive function that unnecessarily fills the call stack when this could be
	 * done iteratively.
	 * 
	 * @param in The quotient of the last call
	 * @return nothing, prints to stdout
	 */
	public static void convertToBin(int in) {
		int q = in / 2;
		int r = in % 2;
		if (q > 0)
			convertToBin(q);
		System.out.println(r);
	}

	/**
	 * Pollutes the call stack and multiplies inefficiently.
	 * 
	 * @param a The original first factor
	 * @param b The second factor
	 * @param c The closest we've gotten to the answer, pass 0 for the first call.
	 * @return the product calculated through pure anti-patterns
	 */
	public static int multiply(int a, int b, int c) {
		if (b == 0)
			return c;
		else
			return multiply(a, b - 1, c + a);
	}
}