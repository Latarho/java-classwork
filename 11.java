import javax.swing.JOptionPane;
class AssignmentEleven{
  public static void main(String[] args){
    Die[] dies = new Die [3];
    int[] rolls = new int [3];
    for(int i = 0; i < 3; i++){
      dies[i] = new Die(4+i);
      rolls[i] = dies[i].roll();
    }
    String output = "";
    String results = "The roll results are " + String.valueOf(rolls[0]) + ", " + String.valueOf(rolls[1]) + ", and " + String.valueOf(rolls[2]) + ".";
    String similarity = "";
    boolean[] equalities = new boolean [3];
    String[] similarityComparisons = new String[]{"A and B", "B and C", "A and C"};
    int equalityCounter = 0;
    for(int i = 0; i < 3; i++){
      int other = (i+1)%3;
      equalities[i] = rolls[i] == rolls[other];
    }
    if(equalities[0]&&equalities[1]&&equalities[2]){
      similarity = "All dice rolled equal values.";
      equalityCounter = 3;
    } else {
      for(int i = 0; i < 3; i++){
        if(equalities[i]){
          equalityCounter++;
          similarity += similarityComparisons[i] + " are equal.\n";
        }
      }
    }
    similarity += "There are " + String.valueOf(equalityCounter) + " equal roll(s).";
    output = results+"\n"+similarity;
    javax.swing.JOptionPane.showMessageDialog(null, output);
  }
}
