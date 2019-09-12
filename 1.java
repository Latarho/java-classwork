import javax.swing.JOptionPane;
class assignmentOne {
  public static void main(String[] args){
    String name = JOptionPane.showInputDialog("What is your name?");
    Float hourly = Float.parseFloat(JOptionPane.showInputDialog("How much do you make each hour?"));
    Float hours = Float.parseFloat(JOptionPane.showInputDialog("How many hours have you worked?"));
    Float profit = hourly * hours;
    JOptionPane.showMessageDialog(null, name + " has made $" + profit.toString() + " at $" + hourly.toString() + "/hour over " + hours.toString() + " hours.");
  }
}
