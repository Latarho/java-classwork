import javax.swing.JOptionPane;

class ThreeDice {
  public static void main(String[] args) {
    JOptionPane.showMessageDialog(null, "Press 'OK' to roll 4,5, and 6 sided dice");
    Die[] dies = new Die[3];
    int[] rolls = new int[3];
    for (int i = 0; i < 3; i++) {
      dies[i] = new Die(4 + i);
      rolls[i] = dies[i].roll();
    }
    String output = "";
    String results = "You rolled a " + String.valueOf(rolls[0]) + " on the 4-sided die, a " + String.valueOf(rolls[1])
        + " on the 5-sided die, and a " + String.valueOf(rolls[2]) + " on the 6-sided die";
    String similarity = "";
    boolean[] equalities = new boolean[3];
    String[] similarityComparisons = new String[] { "A and B", "B and C", "A and C" };
    int equalityCounter = 0;
    for (int i = 0; i < 3; i++) {
      int other = (i + 1) % 3;
      equalities[i] = rolls[i] == rolls[other];
    }
    if (equalities[0] && equalities[1] && equalities[2]) {
      similarity = "All of them rolled the same value.";
      equalityCounter = 3;
    } else {
      for (int i = 0; i < 3; i++) {
        if (equalities[i]) {
          equalityCounter++;
          similarity += similarityComparisons[i] + " are equal.\n";
        }
      }
    }
    // similarity += "Exactly " + String.valueOf(equalityCounter) + " of them rolled
    // the same number.";
    if (equalityCounter == 0) {
      similarity = "All of them show different numbers.";
    } else if (equalityCounter < 2) {
      similarity = "Exactly " + String.valueOf(equalityCounter + 1) + " of them show the same number.";
    } else {
      similarity = "All of them show the same number.";
    }
    output = results;
    javax.swing.JOptionPane.showMessageDialog(null, output);
    javax.swing.JOptionPane.showMessageDialog(null, similarity);
  }
}
