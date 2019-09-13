import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Apple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Apple
{
    // instance variables - replace the example below with your own
    DrawingTool fruit;
    boolean eaten;
    Random rand;
    Color color;

    /**
     * Constructor for objects of class Apple
     */
    public Apple(SketchPad canvas)
    {
        // initialise instance variables
        fruit = new DrawintTool(canvas);
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
