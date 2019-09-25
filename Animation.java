
import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
import java.awt.geom.Point2D; 
/**
 * Write a description of class Animation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animation
{
    // instance variables - replace the example below with your own
    int a;
    double t;
    SketchPad canvas;
    DrawingTool pencil;
    Point2D position;
    double pX, pY;
    Random rand;
    /**
     * Constructor for objects of class Animation
     */
    public Animation()
    {
        // initialise instance variables
        canvas = new SketchPad(50,50);
        pencil = new DrawingTool(canvas);
        rand = new Random();
        t = rand.nextInt(359) + 1;
        pX = 0.0;
        pY = 0.0;

        pencil.setColor(Color.RED);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void animate()
    {
        int stuff = 0;
        
        pencil.up();
        pencil.move(58.5,58.5);
        pencil.down();
        pencil.move(58.5,-58.5);
        pencil.move(-58.5,-58.5);
        pencil.move(-58.5,58.5);
        pencil.move(58.5,58.5);
        
    
        pencil.up();
        pencil.home();
        pencil.down();
        pencil.turnRight(t);
        while(true)
        {
            pencil.forward(1);
            pencil.drawCircle(5);
            pencil.setColor(Color.WHITE);
            pencil.backward(1);
            pencil.drawCircle(5);
            pencil.forward(1);
            pencil.setColor(Color.RED);
            position = pencil.getPosition();
            pX = position.getX();
            pY = position.getY();
            if(pX>=50)
            {
                pencil.turnLeft(t);
            }
            if(pY>=50)
            {
                pencil.turnLeft(t);
            }
            if(pX<=-50)
            {
                pencil.turnRight(t);
            }
            if(pY<=-50)
            {
                pencil.turnRight(t);
            }
            
        }
    }
}


