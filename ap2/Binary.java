import javax.swing.JOptionPane;

/**
 * Binary2
 */
public class Binary {

	public static void main(String[] args) {
		int positive = 0;
		int negative = 0;
		{ // Placed in a block to reduce memory footprint later on and allow IDEs to hide
				// it.
			String[] responses = { "Input a positive integer.", "Input a positive integer, please.",
					"You need to input a positive integer.", "Enter a positive integer. If you please.",
					"You really should listen, it's not like the requirements are going to change if you keep trying.",
					"I'm not writing any more of these." };
			int index = 0;
			while (positive <= 0) {
				try {
					positive = Integer.parseInt(JOptionPane.showInputDialog(null, responses[index % responses.length]));
				} catch (Exception e) {
					System.out.println(e);
				}
				index++;
			}
			if (index > 3)
				JOptionPane.showMessageDialog(null, "Thank you, we can finally move on.");
			for (int i = 0; i < responses.length; i++)
				responses[i] = responses[i].replace("positive", "negative");
			index = 0;
			while (negative >= 0) {
				try {
					negative = Integer.parseInt(JOptionPane.showInputDialog(null, responses[index % responses.length]));
				} catch (Exception e) {
					System.out.println(e);
				}
				index++;
			}
			if (index > 3)
				JOptionPane.showMessageDialog(null, "Thank you, we can finally move on.");
		}

		System.out.println("Positive to two's complement: " + binString(toBin(positive)));
		System.out.println("Negative to two's complement: " + binString(toBin(negative)));

		String bin = JOptionPane.showInputDialog(null, "Input a binary string");
		System.out.println("Integer from binary: " + fromBin(fromString(bin)));
	}

	public static boolean[] toBin(int in) {
		boolean[] result;
		{
			double natLogIn = Math.log(Math.abs(in));
			double natLog2 = Math.log(2);
			int bits = 1 + (int) Math.ceil(natLogIn / natLog2);
			result = new boolean[bits];
			System.out.println(bits);
		}
		if (in < 0)
			in += 1;
		{
			int remaining = Math.abs(in);
			for (int i = 1; i < result.length; i++) {
				if (remaining >= Math.pow(2, result.length - (i + 1))) {
					result[i] = true;
					remaining -= Math.pow(2, result.length - (i + 1));
				}
			}
		}
		{
			if (in < 0) {
				for (int i = 0; i < result.length; i++)
					result[i] = !result[i];
			}
		}
		return result;
	}

	public static String binString(boolean[] in) {
		String out = "";
		for (boolean b : in)
			out += b ? "1" : "0";
		return out;
	}

	public static boolean[] fromString(String in) {
		if (!in.matches("^[10]*$"))
			throw new Error("Invalid binary string");
		boolean[] out = new boolean[in.length()];
		for (int i = 0; i < in.length(); i++) {
			out[i] = in.charAt(i) == '1';
		}
		return out;
	}

	public static int fromBin(boolean[] in) {
		int dist = 0;
		for (int i = 1; i < in.length; i++) {
			dist += Math.pow(2, in.length - (i + 1));
		}
		if (in[0]) {
			dist *= -1;
		}
		return dist;
	}
}