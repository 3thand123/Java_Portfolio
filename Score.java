import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Score here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Score
{
    // instance variables - replace the example below with your own
    DrawingTool writer;
    
    /**
     * Constructor for objects of class Score
     */
    public Score(SketchPad canvas)
    {
        // initialise instance variables
        writer = new DrawingTool(canvas);
    }

   
    public void DisplayScore(boolean eaten, int consumed)
    {
        if (consumed < 1)
        {
            writer.up();
            writer.move(50,50);
            writer.down();
            writer.drawString("Score:");
        }
        if (eaten == true && consumed>1)
        {
            writer.up();
            writer.home();
            writer.turnRight(90);
            writer.forward(50 + consumed*4);
            writer.turnLeft(90);
            writer.forward(30);
            writer.turnLeft(90);
            writer.up();
            writer.forward(10);
            writer.down();
            writer.turnRight(90);
            writer.forward(10);
            writer.up();
            writer.backward(10);
            writer.turnLeft(180);
        }
    }
}
