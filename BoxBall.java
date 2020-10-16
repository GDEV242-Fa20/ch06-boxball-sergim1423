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
    private int const_Distance = 10;
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
        if (xPos >= box_width)
        xPosition = xPos - const_Distance;
        else
        xPosition = xPos;
        if (yPos >= box_height)
        yPosition = yPos - const_Distance;
        else
        yPosition = yPos;
        color= ballColor;
        diameter = ballDiameter;
        width = box_width;
        height = box_height;
        canvas = drawingCanvas;
        xSpeed = (int) (Math.random() * 20) + 1;
        ySpeed = (int) (Math.random() * 20) + 1;
        
    }

    /**
     * Draw this ball at its current position onto the canvas.
    
     */
    public void draw()
    {
      canvas.setForegroundColor(color);
      canvas.fillCircle(xPosition, yPosition, 4);
     
    }
    
    /**
     * Erase ball at its current position
     */
    public void erase()
    {
    canvas.eraseCircle(xPosition, yPosition, diameter);
}

/**
 * Move this ball according to its position and speed and redraw.
 */
public void move()
{
    //remove from canvas at the current position
    erase();
    //define radius
    int radius = diameter / 2;
    //set position with respect to the speed
    yPosition += ySpeed;
    xPosition += xSpeed;
    //if x position of the ball is less than zero, 
    //then alter the speed and set the x position of ball
    if (xPosition - radius - const_Distance < 0)
    {
        //Bouncing the ball with in the walls of box
        xSpeed = -xSpeed;
        xPosition = radius + const_Distance;
    }
    //if the x position of the ball is greater than or equal
    // to width, then alter the speed and set the x position of
    // the ball
    else if (xPosition + radius >= width)
    {
        xSpeed = -xSpeed;
        xPosition = width - radius;
    }
    //if the y position of the ball is less than zero, then alter
    //the speed and set the y position of the ball
    if (yPosition - radius - const_Distance <=0)
    {
        ySpeed = -ySpeed;
        yPosition = radius + const_Distance;
    }
    //if the y postion of the ball is greater than or equal
    // to height, alter the speed and set the y position
    //of the ball
    else if (yPosition + radius >= height)
{
    ySpeed = -ySpeed;
    yPosition = height - radius;
}
//draw again at new position
draw();
}
/**
 * return the horizontal position of this ball
 */
public int getXPosition()
{
    return xPosition;
}
/**
 * return the vertical position of this ball
 */
public int getYPosition()
{
    return yPosition;
}
}

