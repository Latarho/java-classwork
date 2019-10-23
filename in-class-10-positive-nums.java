import javax.swing.JOptionPane;

class inClassTenPositives {
public static void main(String[] args)
{
	int counter = 0;
	int sum = 0;

	while (counter < 10) {
		String input = JOptionPane.showInputDialog("Input " + String.valueOf(10 - counter) + " positive integers.");
		try{
			int in = Integer.parseInt(input);
			if (in > 0) {
				sum += in; counter++;
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect input");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Incorrect input");
		}
	}
  JOptionPane.showMessageDialog(null, "Congratulations! The sum of your numbers is " + String.valueOf(sum));
}
}
