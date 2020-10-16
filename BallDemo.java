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
            if(boxBall.getXPosition() >= boxheight + 
            30 * numberOfBalls)
            {
                finished= true;
            }
        }
    }
}
    private void boxBounce(int numberOfBalls)
    {
        //draw rectangle box
        myCanvas.drawRectangle(xPos, yPos, boxwidth, boxheight);
        //loop to create the BouncingBall object and add them 
        //to the balls HashSet
        for(int i = 0; i< numberOfBalls; i++)
        {
            //define the x and y variables and call
            //the randomPosition() method to initialize x and y
            int x = randomPosition();
            int y = randomPosition();
            //pass x and y values to the BouncingBall constructer
            BoxBall boxBall = new BoxBall
            (x,y,16,randomColor(),
            boxwidth,boxheight,myCanvas);
            // add bounceBall object to the balls
            balls.add(boxBall);
            //call the draw() method of bounceBall object
            boxBall.draw();
        }
    }
    //randomPosition() method returns an int value
    //this method creates a random position which lies between the 
    //0 and top half of the screen
    private int randomPosition()
    {
        //get the half of the height of the myCanvas
        int pos = (int) (boxheight);
        //using the pos value generate the random value and 
        //return the value.
        return randomGenerator.nextInt(pos);
    }
        private Color randomColor()
        {
        Random rand = new Random();
       float r = (rand.nextFloat())*.95f;
       float g = rand.nextFloat()*.95f;
       float b = rand.nextFloat()*.95f;
        Color randomColor = new Color(r,g,b);
        return randomColor;
        
        
    }
}


