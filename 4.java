import javax.swing.JOptionPane;
class assignmentFour{
  public static void main(String[] args){
    // Float fahrenheit = Float.parseFloat(JOptionPane.showInputDialog("Input a temperature in Fahrenheit"));
    // Float celsius = (fahrenheit - 32) / 1.8f;
    // String shortCelsius = celsius.toString();
    // shortCelsius = shortCelsius.substring(0, Math.min(shortCelsius.length(), 6));
    // JOptionPane.showMessageDialog(null, "Result: " + shortCelsius + " degrees celsius.");
    String fInput = JOptionPane.showInputDialog("Enter a temperature in Fahrenheit");
    double fVal = Double.parseDouble(fInput);
    double cConv = FtoC(fVal);
    JOptionPane.showMessageDialog(null,fInput+"F is "+cConv+"C.");
    String cInput = JOptionPane.showInputDialog("Enter a temperature in Celsius");
    double cVal = Double.parseDouble(cInput);
    double fConv = CtoF(cVal);
    JOptionPane.showMessageDialog(null,cInput+"C is "+fConv+"F.");
  }
  public static double FtoC(double fah){
    return (fah-32)/1.8f;
  }
  public static double CtoF(double cel){
    return (cel*1.8f)+32;
  }
}
