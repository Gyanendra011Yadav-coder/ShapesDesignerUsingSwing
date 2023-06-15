package Shapes;

import java.awt.*;


public class Triangle extends Shape {
    public Triangle(int base, int height, Image image) {
        super(base, height, 0, image);
    }

    @Override
    public void draw(Graphics g) {
        int[] xPoints = {width / 2, 0, width};
        int[] yPoints = {0, height, height};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}

