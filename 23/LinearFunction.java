// LinearFunction class
// This class models a linear function of the form "y=mx+b"
public class LinearFunction
{
	private final double slope;
	private final double yInt;

	public LinearFunction(){
		slope = 1;
		yInt = 0;
	}

	public LinearFunction(double m, double y){
		slope = m;
		yInt = y;
	}

	public LinearFunction(Point p, double m){
		slope = m;
		yInt = p.yCoord() - (m*p.xCoord());
	}	// m is the slope, p is a point on the line

	public LinearFunction(Point p1, Point p2){
		slope = (p2.yCoord()-p1.yCoord())/(p2.xCoord()-p1.xCoord());
		yInt = p1.yCoord() - (slope*p1.xCoord());
	}	// p1 and p2 are two points on the line

	public double findSlope(){
		return slope;
	}					// returns slope

	public double findYint(){
		return yInt;
	}					// returns y-intercept

	public boolean contains(Point p){
		return (p.xCoord()*slope+yInt)==p.yCoord();
	}			// returns true if p is on this line

	public double findXint(){
		return (-yInt)/slope;
	}					// returns x-intercept

	public double evaluateAt(double x){
		return x*slope+yInt;
	}			// returns the y value of this function at x

	public String toString(){
		return "y = " + String.valueOf(slope) + "x + " + String.valueOf(yInt);
	}					// returns a String that looks like:
}												// "y = 2.0x + 7.0",
												// "y = 2.0x - 7.0" (NOT "y = 2.0x + -7.0"),
												// "y = x + 7.0" (NOT "y = 1.0x + 7.0"),
												// "y = -x + 7.0" (NOT y = -1.0x + 7.0"),
												// "y = 2.0x" (NOT "y = 2.0x + 0.0"),
												//  or
												// "y = 3.0" (NOT "y = 0.0x + 3.0").
