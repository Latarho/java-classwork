import javax.swing.JOptionPane;
class assignmentFour{
  public static void main(String[] args){
    Float fahrenheit = Float.parseFloat(JOptionPane.showInputDialog("Input a temperature in Fahrenheit"));
    Float celsius = (fahrenheit - 32) / 1.8f;
    String shortCelsius = celsius.toString();
    shortCelsius = shortCelsius.substring(0, Math.min(shortCelsius.length(), 6));
    JOptionPane.showMessageDialog(null, "Result: " + shortCelsius + " degrees celsius.");
  }
}
