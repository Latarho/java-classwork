public class LinearFunctionTest
{
	// Do not make any modifications to this class
	
	
	public static void main(String[] args)
	{
		LinearFunction lf1 = new LinearFunction();
		System.out.println("slope = "+lf1.findSlope()+", y-int = "+lf1.findYint()+
			", x-int = "+lf1.findXint()+", if x=-3.25, y="+lf1.evaluateAt(-3.25));
		System.out.println("equation is: "+lf1+"\n");
		
		LinearFunction lf2 = new LinearFunction(2.0, 7.0);
		System.out.println("slope = "+lf2.findSlope()+", y-int = "+lf2.findYint()+
			", x-int = "+lf2.findXint()+", if x=-3.25, y="+lf2.evaluateAt(-3.25));
		System.out.println("equation is: "+lf2+"\n");
		
		Point p1 = new Point(5.0, 6.0);
		LinearFunction lf3 = new LinearFunction(p1, -2.0);
		System.out.println("slope = "+lf3.findSlope()+", y-int = "+lf3.findYint()+
			", x-int = "+lf3.findXint()+", if x=-3.25, y="+lf3.evaluateAt(-3.25));
		System.out.println("equation is: "+lf3+"\n");
		
		Point p2 = new Point(-5.0, 16.0);
		LinearFunction lf4 = new LinearFunction(p1, p2);
		System.out.println("slope = "+lf4.findSlope()+", y-int = "+lf4.findYint()+
			", x-int = "+lf4.findXint()+", if x=-3.25, y="+lf4.evaluateAt(-3.25));
		System.out.println("equation is: "+lf4+"\n");
		
		Point p3 = new Point(5.0, -16.0);
		LinearFunction lf5 = new LinearFunction(p3, p2);
		System.out.println("slope = "+lf5.findSlope()+", y-int = "+lf5.findYint()+
			", x-int = "+lf5.findXint()+", if x=-3.25, y="+lf5.evaluateAt(-3.25));
		System.out.println("equation is: "+lf5+"\n");
		
		Point p4 = new Point(4.0, 16.0);
		LinearFunction lf6 = new LinearFunction(p4, p2);
		System.out.println("slope = "+lf6.findSlope()+", y-int = "+lf6.findYint()+
			", x-int = "+lf6.findXint()+", if x=-3.25, y="+lf6.evaluateAt(-3.25));
		System.out.println("equation is: "+lf6+"\n");
		
		Point p5 = new Point(4.0, -18.0);
		LinearFunction lf7 = new LinearFunction(p3, p5);
		System.out.println("slope = "+lf7.findSlope()+", y-int = "+lf7.findYint()+
			", x-int = "+lf7.findXint()+", if x=-3.25, y="+lf7.evaluateAt(-3.25));
		System.out.println("equation is: "+lf7+"\n");
		
		
	}
}