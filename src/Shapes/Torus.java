package Shapes;

import java.awt.*;

/**
 * This class represents a Torus shape that can be drawn on a graphics context.
 */
public class Torus extends Shape {
    /**
     * Constructs a new Torus with the specified major and minor radii and image.
     *
     * @param majorRadius the major radius of the Torus
     * @param minorRadius the minor radius of the Torus
     * @param image       the image to use for the Torus (if applicable)
     */
    public Torus(int majorRadius, int minorRadius, Image image) {
        // Call the constructor of the superclass (Shape) with the appropriate dimensions
        super(majorRadius + minorRadius, minorRadius * 2, majorRadius, image);
    }

    /**
     * Draws the Torus on the specified graphics context.
     *
     * @param g the graphics context to draw on
     */
    @Override
    public void draw(Graphics g) {
        // Draw the top and bottom circles of the Torus
        g.drawOval(0, height / 2 - depth / 2, depth, depth);
        g.drawOval(width - depth, height / 2 - depth / 2, depth, depth);

        // Draw the left and right arcs of the Torus
        g.drawArc(depth / 2, 0, width - depth, height, 0, 180);
        g.drawArc(depth / 2, 0, width - depth, height, 180, 180);
    }
}