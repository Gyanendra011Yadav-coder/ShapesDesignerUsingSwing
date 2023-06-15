package Shapes;

import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(int width, int height, Image image) {
        super(width, height, 0, image);
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(0, 0, width, height);
    }
}
