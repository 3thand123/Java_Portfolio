import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
import java.awt.geom.Point2D; 
import java.lang.Math;
import java.util.Random;
import java.util.stream.IntStream; 
/**
 * Write a description of class Irregular_Polygon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IrregularPolygon
{
    // instance variables - replace the example below with your own
    int a;
    double t;
    SketchPad canvas;
    DrawingTool pencil;
    Point2D position;
    double pX, pY;
    Random rand;
    
    IntStream k;
    
    ConsoleIO inputman;
    
    /**
     * Constructor for objects of class Irregular_Polygon
     */
    public IrregularPolygon()
    {
        // initialise instance variables
        canvas = new SketchPad(250,250);
        pencil = new DrawingTool(canvas);
        rand = new Random();
        inputman = new ConsoleIO();
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
    public void shapemaker()
    {
        // put your code here
        int points;
        int i;
        int OGpointX, OGpointY;
        int X = 0, Y = 0; 
        double x_coord = 0, y_coord = 0;
        double currentPoint;
        double highestPointY, lowestPointY, highestPointX, lowestPointX;
        int angle, distance;
        double direct;
        
        System.out.print("How many sides would you like your shape to have?\n");
        points = inputman.readInt();
        
        OGpointX = -250;
        OGpointY = rand.nextInt(250) - rand.nextInt(250);
        
        
        pencil.up();
        
        pencil.move(OGpointX, OGpointY);
        position = pencil.getPosition();
        
        highestPointY = position.getY();
        highestPointX = position.getX();
        
        lowestPointY = position.getY();
        lowestPointX = position.getX();
        
        pencil.down();
        
        //Making sure the pencil is pointing up to start drawing
        direct = pencil.getDirection();
        pencil.turnRight(direct);
        pencil.turnLeft(90);
       
        //make all the sides except two because the last two sides
        //the last two sides require more specific code
        for (i = 1; i<=points-2; i++)
        {
           //makes random side lengths and directions
           //always moving right tho when drawing
           angle = rand.nextInt(180) + 1;
           pencil.turnRight(angle); 
           distance = rand.nextInt(125) + 1;
           pencil.forward(distance);
           //orienting pencil up
           pencil.turnLeft(angle);
           
           //keeping track of the highest or lowest points of the shape
           position = pencil.getPosition();
           currentPoint = position.getY();
           
           if(currentPoint > highestPointY)
           {
                highestPointY = currentPoint;
                highestPointX = position.getX();
           }
           if(currentPoint < lowestPointY)
           {
                lowestPointY = currentPoint;
                lowestPointX = position.getX();
            }
        }   
        
        //if the original point we need to connect back to is below the y-axis
        if (OGpointY < 0)
        {
            //ensuring the next vertex is above the highest point of the shape so far
            //this creates a clear path from this poin to the start of the shape so no lines cross
            y_coord = rand.nextDouble() + rand.nextInt(Math.abs((int)lowestPointY)) - 250;
            x_coord = rand.nextDouble() + rand.nextInt(((int)x_coord-(int)lowestPointX)+1) + lowestPointX;
            pencil.move(x_coord, y_coord);
        }
        //if the original point we need to connect back to is above the y-axis
        if (OGpointY >= 0)
        {
            //making sure the random number generater has positive parameters
            if (highestPointY > 250)
            {
                y_coord = rand.nextDouble() + rand.nextInt((int)highestPointY - 250) + highestPointY;
            }   
            else 
            {
                y_coord = rand.nextDouble() + rand.nextInt(250 - (int)highestPointY) + highestPointY;
            }
            x_coord = rand.nextDouble() + rand.nextInt(((int)x_coord-(int)highestPointX)+1) + highestPointX;
            pencil.move(x_coord, y_coord);
        }
        //returning to start
        pencil.move(OGpointX, OGpointY);
        
        
        //Code below was another wat of doing this lab.
        //However, it's shapes were more predictable so I opted for the above code
        /*
        for(i = 1; i<=points-1; i++)
        {
           x_coord = rand.nextDouble() + rand.nextInt(((250/(points+1)) - (int)x_coord) + 1) + x_coord;
           y_coord = rand.nextDouble() + rand.nextInt(249) - rand.nextInt(250);
           pencil.move(x_coord, y_coord);
           
           position = pencil.getPosition();
           currentPoint = position.getY();
           
           if(currentPoint > highestPointY)
           {
                highestPointY = currentPoint;
                highestPointX = position.getX();
           }
           if(currentPoint < lowestPointY)
           {
                lowestPointY = currentPoint;
                lowestPointX = position.getX();
            }
        }   
        System.out.println(x_coord);
        pencil.drawCircle(5);
        if (OGpointY < 0)
        {
            y_coord = rand.nextDouble() + rand.nextInt(Math.abs((int)lowestPointY)) - 250;
            x_coord = rand.nextDouble() + rand.nextInt(((int)x_coord-(int)lowestPointX)+1) + lowestPointX;
            pencil.move(x_coord, y_coord);
        }
        if (OGpointY >= 0)
        {
            y_coord = rand.nextDouble() + rand.nextInt(250 - (int)highestPointY) + highestPointY;
            x_coord = rand.nextDouble() + rand.nextInt(((int)x_coord-(int)highestPointX)+1) + highestPointX;
            pencil.move(x_coord, y_coord);
        }
        pencil.move(OGpointX, OGpointY);
        */
   }
}
