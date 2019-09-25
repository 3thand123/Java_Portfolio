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
    String input;
    ConsoleIO typer;
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
        slitherman = new Snake(canvas);
        fruitdude = new Apple(canvas);
        numbers = new Score(canvas);
        typer = new ConsoleIO();
        
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
        int x = 1;
        //ear.main(slitherman);
        while(!"stop".equals(input))
        {
            input = typer.readLine();
            numbers.DisplayScore(fruitdude.eaten, fruitdude.consumed);
            slitherman.move(input, fruitdude.consumed);
            fruitdude.doJob(slitherman.snakeX, slitherman.snakeY);
            x++;
        }
    }
}

