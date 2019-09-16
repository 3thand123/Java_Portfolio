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
    int consumed;
    int x,y;

    /**
     * Constructor for objects of class Apple
     */
    public Apple(SketchPad canvas)
    {
        // initialise instance variables
        fruit = new DrawingTool(canvas);
        eaten = true;
        consumed = 0;
        x= 0;
        y = 0;
        rand = new Random();
    }

    public void doJob(int snakeX, int snakeY)
    {
        if (eaten == true)
            {
                fruit.down();
                fruit.setColor(Color.WHITE);
                fruit.drawCircle(3);
                fruit.setColor(Color.RED);
                x = rand.nextInt(10) * 5 - 50;
                y = rand.nextInt(10) * 5 - 50;
                fruit.up();
                fruit.move(x,y);
                fruit.down();
                fruit.drawCircle(3);
                consumed++;
                eaten = false;
            }
        if (snakeX == x && snakeY == y)
            {
                eaten = true;
            }
    }
}
