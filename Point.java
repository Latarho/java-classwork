public class Point
{
	// do not make any modifications to this class
	
	
	private final double myX, myY;
	// the coordinates of this Point
	
	// default constructor								
	public Point()										
	{														
		myX = 0;
		myY = 0;
	}
	
	// copy contructor
	public Point(Point pt)
	{
		myX = pt.myX;
		myY = pt.myY;
	}
	
	// creates this Point as (x, y)
	public Point(double x, double y)
	{
		myX = x;
		myY = y;
	}
	
	// Accessors
	double xCoord()
	{
		return myX;
	}
	
	double yCoord()
	{
		return myY;
	}
	
	// sends backs a string version of this Point
	public String toString()
	{
		String ptStr = new String();
		ptStr = "(" + myX + "," + myY + ")";
		return ptStr;
	}
	
	// returns the inverse of this Point
	public Point findInverse()
	{
		Point invPt = new Point(myY, myX);
		return invPt;
	}
	
	
 
// returns the distance from this Point to pt
	public double findDistance(Point pt)
	{
		// d = sqrt((x1-x2)^2 + (y1-y2)^2)
		double horizDist = myX - pt.myX;
		double vertDist = myY - pt.myY;
		
		double distance = Math.sqrt(horizDist*horizDist + vertDist*vertDist);
		return distance;
	}


	// returns true of pt has the same coordinates as this point
	public boolean equals(Point pt)
	{
		if(myX == pt.myX && myY == pt.myY)
			return true;
		else
			return false;
	}
		
}
 
