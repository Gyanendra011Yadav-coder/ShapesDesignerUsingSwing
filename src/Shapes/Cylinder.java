package Shapes;

import java.awt.*;

public class Cylinder extends Shape {
    public Cylinder(int radius, int height, Image image) {
        super(radius, height, radius, image);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(0, 0, width, depth);
        g.drawLine(0, depth / 2, 0, height - depth / 2);
        g.drawLine(width, depth / 2, width, height - depth / 2);
        g.drawOval(0, height - depth, width, depth);
    }
}
