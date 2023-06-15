package Shapes;

import java.awt.*;


public class Square extends Shape {
    public Square(int sideLength, Image image) {
        super(sideLength, sideLength, 0, image);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(0, 0, width, height);
    }
}