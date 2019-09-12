import javax.swing.JOptionPane;
class assignmentSix{
  public static void main(String[] args) {
    int bottom;
    int top;
    try {
      bottom = Integer.parseInt(args[0]);
      top = Integer.parseInt(args[1]);
    } catch(Exception exception_name) {
      bottom = 0;
      top = 10;
    }
    int value
    JOptionPane.showMessageDialog(null, "I've picked an integer between " + String.valueOf(bottom) + " and " + String.valueOf(top) + ".");
  }
}
