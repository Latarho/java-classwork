import javax.swing.JOptionPane;




public class StringToLinearTest
{
	public static void main(String[] args)
	{	
		String funcStr = JOptionPane.showInputDialog("Enter an equation");
		System.out.println(funcStr);
		LinearFunction lf = StringToLinear.convert(funcStr);
		System.out.println("slope = "+lf.findSlope()+", y-int = "+lf.findYint());
		System.out.println("equation is: "+lf+"\n");
	}
}