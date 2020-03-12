import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class Triangle extends JComponent implements Shapes {
	static final long serialVersionUID = 69420;
	private int x = 200;
	private int y = 400;
	private int width = 200;
	private int height = 150;

	private Color shapeColor = Color.black;

	public Triangle(Color backColor, Color color) {
		setBackground(backColor);
		shapeColor = color;
	}

	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		Path2D.Double path = new Path2D.Double();
		path.moveTo(x - (width / 2), y - (height / 2));
		path.lineTo(x + (width / 2), y - (height / 2));
		path.lineTo(x, y + (height / 2));
		path.closePath();
		g2.setColor(shapeColor);
		g2.fill(path);
		g2.draw(path);
	}

	public double Perimeter() {
		var a = width;
		var b = Math.sqrt(Math.pow(width / 2, 2) + Math.pow(height, 2));
		return a + 2 * b;
	}

	public double Area() {
		return width * height / 2;
	}

	public int numberOfSides() {
		return 3;
		// Is this "future-proofing" for n-sided entities or just a meaningless getter
		// that the compiler will optimise out?
	}

	public int numberOfVertices() {
		return 3;
	}
}