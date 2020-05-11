package ap6;

/**
 * Circles.java
 *
 * This is a circles class that contains the properties ans methods to use on a circle
 * @author - I received help from ...
 *
 */
import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class Circles extends JComponent implements Shapes {
	static final long serialVersionUID = 12345;
	private int x = 60; // x coordinate of starting point of circle.
	private int y = 60; // y coordinate of starting point of circle.
	private int width = 200; // width of circle.
	private int height = 200; // height of circle.
	private Color shapeColor = Color.black; // Stores the color of the shape

	// Constructor for circles and sets the color of the shape.
	public Circles(Color backColor, Color color) {
		setBackground(backColor);
		shapeColor = color;
	}

	// This method draws the circle
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		// Creates an instance of the object ellipse
		// and then displays it to the frame.
		Ellipse2D.Double Ellipse = new Ellipse2D.Double(x, y, width, height);
		g2.setColor(shapeColor);
		g2.fill(Ellipse);
		g2.draw(Ellipse);
	}

	// Computes the perimeter of the circle
	public double Perimeter() {
		double diameter = x + width;

		return Math.PI * diameter;
	}

	// Computes the Area of the circle
	public double Area() {
		double radius = (x + width) / 2;

		return (Math.pow(Math.PI, 2) * radius);
	}

	// Returns the number of sides of a circle
	public int numberOfSides() {
		return 0;
	}

	// Returns the number of vertices of a circle
	public int numberOfVertices() {
		return 0;
	}

}
