package Shapes;

import java.awt.*;


public class Cone extends Shape {
    public Cone(int radius, int height, Image image) {
        super(radius, height, radius, image);
    }

    @Override
    public void draw(Graphics g) {
        g.drawLine(width / 2, height, 0, 0);
        g.drawLine(width / 2, height, width, 0);
        g.drawOval(0, 0, width, depth);
    }
}
