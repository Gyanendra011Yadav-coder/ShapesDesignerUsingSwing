package Shapes;

import java.awt.*;

public class Cube extends Shape {
    public Cube(int sideLength, Image image) {
        super(sideLength, sideLength, sideLength, image);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(0, 0, width, height);
    }
}
