package Shapes;

import java.awt.*;

public class Sphere extends Shape {
    public Sphere(int radius, Image image) {
        super(radius, radius, radius, image);
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(0, 0, width, height);
    }
}
