import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class SpriteTest here.
 *
 * @author (Ethan Davies)
 * @version (V.1)
 */
public class MoveDot
{
    // instance variables - replace the example below with your own
    //int x, y;
    //int consumed;
    SketchPad canvas;
    Snake slitherman;
    Apple fruitdude;
    Score numbers;
    //DrawingTool pencil, apple, grid, writer;
    //Random rand;
    //Color color;
    //boolean eaten = true;
    /**
     * Constructor for objects of class SpriteTest
     */
    public MoveDot()
    {
        // initialise instance variables
        canvas = new SketchPad(50,50);
        slitherman = new Snake(canvas, apple.consumed);
        fruitdude = new Apple(canvas, );
        numbers = new Score(canvas,apple.consumed, apple.eaten);
        //pencil = new DrawingTool(canvas);
        //apple = new DrawingTool(canvas);
        //grid = new DrawingTool(canvas);
        //writer = new DrawingTool(canvas);
        //apple.setColor(Color.RED);
        //rand = new Random();
        //pencil.setWidth(5);
        //grid.setWidth(1);
        //x_coordinate = 0;
        //y_coordinate = 0;
        //consumed = 0;
    }

    
    public void main()
    {
        writer.up();
        writer.move(50,50);
        writer.down();
        writer.drawString("Score:");
        while(!"stop".equals(input))
        {
            if (eaten == true)
            {
                apple.down();
                apple.setColor(Color.WHITE);
                apple.drawCircle(3);
                apple.setColor(Color.RED);
                x = rand.nextInt(10) * 5 - 50;
                y = rand.nextInt(10) * 5 - 50;
                apple.up();
                apple.move(x,y);
                apple.down();
                apple.drawCircle(3);
                consumed++;
                if (consumed > 1)
                {
                    writer.up();
                    writer.home();
                    writer.turnRight(90);
                    writer.forward(50 + consumed*4);
                    writer.turnLeft(90);
                    writer.forward(30);
                    writer.turnLeft(90);
                    writer.up();
                    //writer.turnRight(90);
                    writer.forward(10);
                    writer.down();
                    writer.turnRight(90);
                    writer.forward(10);
                    writer.up();
                    writer.backward(10);
                    writer.turnLeft(180);
                }   
                eaten = false;
            }
            if (x_coordinate == x && y_coordinate == y)
            {
                eaten = true;
            }
        }
    }
}
