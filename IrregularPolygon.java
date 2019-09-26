import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
import java.awt.geom.Point2D; 
import java.lang.Math;
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
        double x_coord, y_coord;
        System.out.print("How many sides would you like your shape to have?\n");
        points = inputman.readInt() - 1;
        
        
        
        OGpointX = rand.nextInt(250) - 250;
        OGpointY = rand.nextInt(250) - 250;
        pencil.up();
        pencil.move(OGpointX, OGpointY);
        pencil.down();
        for (i = 0; i <= points/2 - 1; i++)
        {
            position = pencil.getPosition();
            x_coord = position.getX();
            y_coord = position.getY();
            X = rand.nextInt(Math.abs((int)x_coord)) + ((int)x_coord - 250);
            //trying to generate a number that will ensure the next point is further to the right of the last one
            Y = rand.nextInt((int)y_coord) - ((int)y_coord + 250);
            pencil.move(X,Y);
        }
        pencil.move(OGpointX, OGpointY);
    }
}
