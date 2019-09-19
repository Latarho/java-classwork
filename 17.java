import javax.swing.JOptionPane;

class assignmentSeventeen {
  public static void main(String[] args){
    int[] losingNumbers = new int[]{2,3,12};
    int[] winningNumbers = new int[]{7,11};
    Die[] dice = new Die[]{new Die(6), new Die(6)};
    int wins = 0;
    int losses = 0;
    JOptionPane.showMessageDialog(null, "the game is afoot");
    while (true){
      int[] rolls = new int[2];
      for(int i = 0; i < 2; i++){
        rolls[i] = dice[i].roll();
      }
      int sum = rolls[0] + rolls[1];
      String output = "You rolled " + String.valueOf(rolls[0]) + " and " + String.valueOf(rolls[1]) + ". The sum it " + String.valueOf(sum);
      JOptionPane.showMessageDialog(null, output);
      int state = 0;
      for (int num : winningNumbers) if (num==sum) state = 1; // this is disgusting lol
      for (int num : losingNumbers) if (num==sum) state = -1;
      switch (state) {
        case 1: {JOptionPane.showMessageDialog(null, "You win!"); wins++; break;}
        case -1: {JOptionPane.showMessageDialog(null, "You've lost."); losses++; break;}
      }
      if(state != 0){
        String response = JOptionPane.showInputDialog(null, "Would you like to play again?\n" + String.valueOf(wins) + " wins, " + String.valueOf(losses) + " losses.");
        if(!response.matches("[Yy]e?s?")){ // wow that actually worked on the first try
          System.exit(0);
        }
      }
    }
  }
}
