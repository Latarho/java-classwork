package ap6;

/**
 * @(#)ShapesRunner.java
 *
 *
 * @author 
 * @version 1.00 2015/3/15
 */

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.*;

public class ShapesRunner {
	public static void main(String[] args) {

		// This section defines and creates a frame to display the shapes
		JFrame shapeFrame = new JFrame();
		shapeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		shapeFrame.setTitle("Geometric Shapes");
		shapeFrame.setSize(800, 800);

		// This section tests the circle methods
		Circles circle = new Circles(Color.white, Color.blue);
		shapeFrame.add(circle);
		shapeFrame.setVisible(true);
		Square square = new Square(Color.white, Color.green, 60);
		shapeFrame.add(square);
		shapeFrame.setVisible(true);
		Rectangle rect = new Rectangle(Color.white, Color.yellow);
		shapeFrame.add(rect);
		shapeFrame.setVisible(true);
		Triangle tri = new Triangle(Color.white, Color.red);
		shapeFrame.add(tri);
		shapeFrame.setVisible(true);

		// This section tests the computations
		JOptionPane.showMessageDialog(null, "The perimeter of the circle is : " + circle.Perimeter());
		JOptionPane.showMessageDialog(null, "The Area of the circle is : " + circle.Area());
		JOptionPane.showMessageDialog(null, "The number of sides of the circle is : " + circle.numberOfSides());
		JOptionPane.showMessageDialog(null, "The number of vertices of the circle is : " + circle.numberOfVertices());

		JOptionPane.showMessageDialog(null, "The perimeter of the square is : " + square.Perimeter());
		JOptionPane.showMessageDialog(null, "The Area of the square is : " + square.Area());
		JOptionPane.showMessageDialog(null, "The number of sides of the square is : " + square.numberOfSides());
		JOptionPane.showMessageDialog(null, "The number of vertices of the square is : " + square.numberOfVertices());

		JOptionPane.showMessageDialog(null, "The perimeter of the rect is : " + rect.Perimeter());
		JOptionPane.showMessageDialog(null, "The Area of the rect is : " + rect.Area());
		JOptionPane.showMessageDialog(null, "The number of sides of the rect is : " + rect.numberOfSides());
		JOptionPane.showMessageDialog(null, "The number of vertices of the rect is : " + rect.numberOfVertices());

		JOptionPane.showMessageDialog(null, "The perimeter of the tri is : " + tri.Perimeter());
		JOptionPane.showMessageDialog(null, "The Area of the tri is : " + tri.Area());
		JOptionPane.showMessageDialog(null, "The number of sides of the tri is : " + tri.numberOfSides());
		JOptionPane.showMessageDialog(null, "The number of vertices of the tri is : " + tri.numberOfVertices());

	}
}