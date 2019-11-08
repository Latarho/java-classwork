//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class BallFrame extends JFrame
{
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public BallFrame()
	{
		super("This is garbage");

		setSize(WIDTH,HEIGHT);
		setBackground(Color.WHITE);
		BallPanel bp = new BallPanel(WIDTH,HEIGHT);
		getContentPane().add(bp);

		setVisible(true);
		bp.moveAll();
		
		
	}

	
}