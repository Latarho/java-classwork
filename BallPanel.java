

import java.awt.Font;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BallPanel extends JPanel
{
//	Ball b1;
	int wid;
	int len;
	int numBalls  = 20;
	Ball[] ballGroup;

	public BallPanel(int w, int l)
	{
		wid = w;
		len = l;

		ballGroup = new Ball[numBalls];

		for(int i=0; i<numBalls; i++)
		{
			ballGroup[i]=new Ball(Math.random()*(wid-2*10),Math.random()*(len-2*10),Math.random(),Math.random(),10,wid,len);
		}


		setBackground(Color.WHITE);
		setVisible(true);


	}
	public void moveAll()
	{
		while(true)
		{
			try
            {
                Thread.sleep(10);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
			repaint();
		}
	}

	public void update(Graphics window)
	{
		paint(window);
		System.out.println(this.getWidth());
	}


	public void paint(Graphics window)
	{

		for(int i=0; i<numBalls; i++)
		{
			ballGroup[i].erase(window);
			ballGroup[i].move();
			ballGroup[i].collide(ballGroup, wid, len);
			ballGroup[i].draw(window);
		}


	}
}