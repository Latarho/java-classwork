import javax.swing.JOptionPane;
public class PointsComparison{
  public static void main(String[] args){
    String player1Name = JOptionPane.showInputDialog("Input player 1's name.");
    int player1Score = Integer.parseInt(JOptionPane.showInputDialog("Input " + player1Name + "'s score."));
    String player2Name = JOptionPane.showInputDialog("Input player 2's name.");
    int player2Score = Integer.parseInt(JOptionPane.showInputDialog("Input " + player2Name + "'s score."));
    if(player1Score == player2Score){
      JOptionPane.showMessageDialog(null, "There was a tie.");
    } else if (player1Score > player2Score){
      JOptionPane.showMessageDialog(null, "The winning player, " + player1Name + ", scored " + String.valueOf(player1Score-player2Score) + " points more than " + player2Name + ".");
    } else {
      JOptionPane.showMessageDialog(null, "The winning player, " + player2Name + ", scored " + String.valueOf(player2Score-player1Score) + " points more than " + player1Name + ".");
    }
  }
}
