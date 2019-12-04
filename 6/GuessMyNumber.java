import javax.swing.JOptionPane;
public class GuessMyNumber{
  public static void main(String[] args) {
    int bottom;
    int top;
    // try {
    //   bottom = Integer.parseInt(args[0]);
    //   top = Integer.parseInt(args[1]);
    // } catch(Exception exception_name) {
    bottom = 1;
    top = 8;
    // }
    int value = (int)(Math.random()*(top-bottom)+bottom);
    JOptionPane.showMessageDialog(null, "I've picked an integer between " + String.valueOf(bottom) + " and " + String.valueOf(top) + ".");
    while (true){
      int guess = Integer.parseInt(JOptionPane.showInputDialog("Take a guess! (" + String.valueOf(bottom) + "-" + String.valueOf(top) + ")"));
      if(guess == value){
        JOptionPane.showMessageDialog(null, "Congratulations! You've successfully guessed my number, "+String.valueOf(value)+".");
        System.exit(0);
      }
      else if (guess > value){
        JOptionPane.showMessageDialog(null, "Too high; try again.");
      }
      else {
        JOptionPane.showMessageDialog(null, "Too low; try again.");
      }
    }
  }
}
