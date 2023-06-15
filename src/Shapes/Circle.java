package Shapes;

import java.awt.*;

public class Circle extends Shape {
    public Circle(int radius, Image image) {
        super(radius, radius, 0, image);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(0, 0, width, height);
    }
}
