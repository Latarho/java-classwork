import javax.swing.JOptionPane;

public class Binary {
  public static void main(String[] args) {
    int positive = 0;
    while (!(positive > 0)) {
      positive = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a positive number"));
    }
    System.out.println(toBinary(positive));
    int negative = 0;
    while (!(negative < 0)) {
      negative = Integer.parseInt(JOptionPane.showInputDialog(null, "Input a negative number"));
    }
    System.out.println(toBinary(negative));
  }

  public static String toBinary(int in) {
    if (in == 0) {
      return "0";
    } else if (in > 0) {
      return Integer.toString(in, 2);
    } else {
      int bitCount = (int) Math.ceil(log(Math.abs(in), 2));
      return Integer.toString((int) Math.pow(2, bitCount) + in, 2);
    }
  }

  static double log(double in, double base) {
    return Math.log(in) / Math.log(base);
  }
}