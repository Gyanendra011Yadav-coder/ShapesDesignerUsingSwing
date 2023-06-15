package Shapes;

import java.awt.*;

/**
 * This abstract class represents a basic Shape object that can be drawn on a graphics context.
 */
public abstract class Shape {
    public int width;
    public int height;
    public int depth;
    public Image image;

    /**
     * Constructs a new Shape with the specified dimensions and image.
     *
     * @param width  the width of the Shape
     * @param height the height of the Shape
     * @param depth  the depth of the Shape (if applicable)
     * @param image  the image to use for the Shape (if applicable)
     */
    public Shape(int width, int height, int depth, Image image) {
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.image = image;
    }

    /**
     * Draws the Shape on the specified graphics context.
     *
     * @param g the graphics context to draw on
     */
    public abstract void draw(Graphics g);

    /**
     * Returns the image used for the Shape.
     *
     * @return the image used for the Shape
     */
    public Image getImage() {
        return image;
    }
}