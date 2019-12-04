import java.awt.Color;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Square extends JComponent implements Shapes {
  private int x = 500;
  private int y = 500;
  private int edge = 200;
  private Color shapeColor = Color.black;

  public Square(Color backColor, Color color, int edgeLength) {
    setBackground(backColor);
    shapeColor = color;
    edge = edgeLength;
  }

  public void paintComponent(Graphics g) {
    Graphics2D g2 = (Graphics2D) g;

    Rectangle2D.Double Ellipse = new Rectangle2D.Double(x, y, edge, edge);
    g2.setColor(shapeColor);
    g2.fill(Ellipse);
    g2.draw(Ellipse);
  }

  public double Perimeter() {
    return 4 * edge;
  }

  public double Area() {
    return Math.pow(edge, 2);
  }

  public int numberOfSides() {
    return 4;
  }

  public int numberOfVertices() {
    return 4;
  }
}