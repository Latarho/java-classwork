package ap6;

import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Rectangle extends JComponent implements Shapes {
	static final long serialVersionUID = 12345;
	private int x = 400;
	private int y = 300;
	private int width = 200;
	private int height = 150;

	private Color shapeColor = Color.black;

	public Rectangle(Color backColor, Color color) {
		setBackground(backColor);
		shapeColor = color;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D.Double Ellipse = new Rectangle2D.Double(x, y, width, height);
		g2.setColor(shapeColor);
		g2.fill(Ellipse);
		g2.draw(Ellipse);
	}

	public double Perimeter() {
		return 2 * (width + height);
	}

	public double Area() {
		return width * height;
	}

	public int numberOfSides() {
		return 4;
	}

	public int numberOfVertices() {
		return 4;
	}
}