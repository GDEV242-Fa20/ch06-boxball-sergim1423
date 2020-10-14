import java.awt.Color;
import java.util.HashSet;
import java.util.Random;


/**
 * Class BallDemo - a short demonstration showing animation with the 
 * Canvas class. 
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class BallDemo   
{
    private Canvas myCanvas;
    
    //add variables
    int boxheight = 600;
    int boxwidth= 550;
    int canvasWidth=700;
    int canvasHeight = 700;
    int xPos = 10;
    int yPos = 10;
    //define the HashSet object of type BouncingBall
    HashSet<BoxBall> balls = new HashSet<BoxBall>();
    //add the random class variable
    private Random randomGenerator;
   

    /**
     * Create a BallDemo object. Creates a fresh canvas and makes it visible.
     */
    public BallDemo()
    {
        myCanvas = new Canvas("Ball Demo", canvasWidth, canvasHeight);
        //define the random object
        randomGenerator = new Random();
    }
/**
 * simulate numberOfBalls to bounce within the rectangle box
 */
public void bounce(int numberOfBalls)
{
    //set visibility of the myCanvas
    myCanvas.setVisible(true) ;
    //call method boxBounce() by passing the numberOfBalls
    boxBounce(numberOfBalls);
    //set the boolean value finished to false
    boolean finished = false;
    //loop until finished is true
    while(!finished)
    {
        //set the delay
        myCanvas.wait(50);
        //make the move of the each balls in the hashset
        for(BoxBall boxBall : balls)
        {
            //call the move () method to make the ball move
            boxBall.move();
            //stop once ball has traveled a certian distance
            //on x axis
            if(bocBall.getXPosition() >= boxheight + 
            30 * numberOfBalls)
            {
                finished= true;
            }
    
    /**
     * Simulate two bouncing balls
     */
    public void bounce()
    {
        int ground = 400;   // position of the ground line

        myCanvas.setVisible(true);

        // draw the ground
        myCanvas.setForegroundColor(Color.BLACK);
        myCanvas.drawLine(50, ground, 550, ground);

        // create and show the balls
        BouncingBall ball = new BouncingBall(50, 50, 16, Color.BLUE, ground, myCanvas);
        ball.draw();
        BouncingBall ball2 = new BouncingBall(70, 80, 20, Color.RED, ground, myCanvas);
        ball2.draw();

        // make them bounce
        boolean finished =  false;
        while (!finished) {
            myCanvas.wait(50);           // small delay
            ball.move();
            ball2.move();
            // stop once ball has travelled a certain distance on x axis
            if(ball.getXPosition() >= 550 || ball2.getXPosition() >= 550) {
                finished = true;
            }
        }
    }
}
