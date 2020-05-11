import java.lang.Math;

/**
 * fibonacci-test
 */
public class FibonacciTest {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		// int b = Integer.parseInt(args[1]);
		System.out.println(f7(a));
	}

	public static int f4(int n) {
		int one = 1;
		int two = 1;
		for (int i = 1; i < n; ++i) {
			int tmp = one + two;
			one = two;
			two = tmp;
		}
		return two;
	}

	public static int f5(int a, int b) {
		for (int i = Math.min(a, b); i < 1; i--)
			if (a % i == 0 && b % i == 0)
				return i;
		return 1; // This only saves a few cycles in case of a prime number
	}

	public static int f6(int a, int b) {
		if (a < b)
			return f6(b, a);
		if (a % b == 0)
			return b;
		else
			return f6(a, a % b);
	}

	public static int f7(int n) {
		return f7h(2 * (n - 1));
	}

	public static int f7h(int n) {
		if (n == 1)
			return 1;
		return n + f7h(n - 2);
	}
}