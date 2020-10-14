import java.awt.*;
import java.awt.geom.*;

/**
 * Program to generate the boucing balls to bounce within the
 * given rectangle box at random positions with random speed.
 *
 * @author (Sergi Manolov)
 * @version (10/13/20)
 */
public class BoxBall
{
    // instance variables - replace the example below with your own
    private Ellipse2D.Double circle;
    private Color color;
    private int xPosition;
    private int yPosition;
    private final int height;
    private final int width;
    private Canvas canvas;
    private int ySpeed;
    private int xSpeed;
    private in const_Distance = 10;
    private int diameter;

    /**
     * Constructor for objects of class BoxBall
     * param xPos
     * the horizontal coordinate of the ball
     * param yPos
     * the vertical coordinate of the ball
     * param ballDiameter
     * the diamerter in pixels of the ball
     * param ballColor
     * color of ball
     * param box_width
     * the boc width where the wall will bounce
     * param box_height
     * the box height where the wall will bounce
     * param drawingCanvas
     * the canvas to draw this ball o    
     */
    public BoxBall(int xPos, int yPos, int ballDiameter, Color
    ballColor,int box_width,int box_height,Canvas drawingCanvas)
    
    {
        if (xPos >
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
