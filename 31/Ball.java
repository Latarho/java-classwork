/**
 * @(#)Ball.java
 *
 *
 * @author 
 * @version 1.00 2014/8/10
 */
import java.awt.Color;
import java.awt.Graphics;

public class Ball 
{

	private double xCoord;
	private double yCoord;
	private double xVel;
	private double yVel;
	private double radius;
	private Color col;
	private double xAcc;
	private double yAcc;
	private int wid;
	private int len;

    public Ball(double a, double b, double c, double d, double e, int f, int g) 
    {
    	xCoord = a;
    	yCoord = b;
    	xVel = c;
    	yVel = d;
    	radius = e;
    	wid = f;
    	len = g;
    	col = new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256));
    }
    
    public void move()
    {
    	xCoord = xCoord + xVel;
		yCoord = yCoord + yVel;
		yVel += 0.098;
    }
    
    public void draw(Graphics g)
    {
    	g.setColor(col);
    	g.fillOval((int)(xCoord-radius),(int)(yCoord-radius),(int)(radius*2),(int)(radius*2));
    }
    
    public void erase(Graphics g)
    {
    	g.setColor(Color.WHITE);
    	g.fillOval((int)(xCoord-radius),(int)(yCoord-radius),(int)(radius*2),(int)(radius*2));
    }
    public void collide(Ball[] balls, int w, int l){
		if(xCoord > w || xCoord < 0){
			xVel *= -0.8;
		}
		if(yCoord > (l-30)){
			yVel *= -0.8;
		}
		for(int i = 0; i < balls.length; i++){
			double tx = balls[i].xCoord;
			double ty = balls[i].yCoord;
			double x = xCoord;
			double y = yCoord;
			double dx = Math.abs(x-tx);
			double dy = Math.abs(y-ty);
			double d = Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2));
			if(d < (radius*2)){
				// The balls are close enough to collide.
				// Do some naive collision math to make at least something happen
				// not at all accurate to real life though
				xVel -= dx/10;
				yVel -= dy/10;
			}
		}
	}
    
}