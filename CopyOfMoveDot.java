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

public class CopyOfMoveDot
{
    // instance variables - replace the example below with your own
    int x, y;
    int x_coordinate, y_coordinate;
    int consumed;
    SketchPad canvas;
    DrawingTool pencil, apple, grid, writer;
    Random rand;
    String input = "0";
    ConsoleIO typer;
    Color color;
    int radius = 10;
    boolean down, up, left, right, eaten = true;
    public CopyOfMoveDot()
    {
        // initialise instance variables
        canvas = new SketchPad(50,50);
        pencil = new DrawingTool(canvas);
        apple = new DrawingTool(canvas);
        grid = new DrawingTool(canvas);
        writer = new DrawingTool(canvas);
        apple.setColor(Color.RED);
        typer = new ConsoleIO();
        rand = new Random();
        pencil.setWidth(5);
        grid.setWidth(1);
        x_coordinate = 0;
        y_coordinate = 0;
        consumed = 0;
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
            input = typer.readLine();
            switch (input)
            {
                case "5":
                    if(down == true){
                        pencil.turnLeft(180);
                        //pencil.forward(5 * consumed);
                    }
                    else
                        if (left == true){
                            pencil.setColor(Color.WHITE);
                            pencil.backward(5*consumed);
                            pencil.forward(5*consumed);
                            pencil.setColor(Color.BLACK);
                            pencil.turnRight(90);
                        }
                        else
                            if(right == true){
                                pencil.setColor(Color.WHITE);
                                pencil.backward(5*consumed);
                                pencil.forward(5*consumed);
                                pencil.setColor(Color.BLACK);
                                pencil.turnLeft(90);
                            }
                     pencil.backward(5 * consumed);
                     pencil.setColor(Color.WHITE);
                     pencil.forward(5 * consumed);
                     pencil.setColor(Color.BLACK);
                     pencil.forward(5 * consumed - 5);
                     pencil.forward(5);
                     up = true;
                     down = false;
                     right = false;
                     left = false;
                     y_coordinate += 5;
                     break;
                case "2":
                    if(up == true){
                      pencil.turnLeft(180);
                      //pencil.forward(5 * consumed);
                    }
                    else
                        if (left == true){
                            pencil.setColor(Color.WHITE);
                            pencil.backward(5*consumed);
                            pencil.forward(5*consumed);
                            pencil.setColor(Color.BLACK);
                            pencil.turnLeft(90);
                        }
                        else
                            if(right == true){
                               pencil.setColor(Color.WHITE);
                               pencil.backward(5*consumed);
                               pencil.forward(5*consumed);
                               pencil.setColor(Color.BLACK);
                               pencil.turnRight(90);
                            }
                            else
                                if (down == false){
                                    pencil.turnRight(180);
                                } 
                     pencil.backward(5 * consumed);
                     pencil.setColor(Color.WHITE);
                     pencil.forward(5 * consumed);
                     pencil.setColor(Color.BLACK);
                     pencil.forward(5 * consumed - 5);
                     pencil.forward(5);
                     down = true;
                     up = false;
                     right = false;
                     left = false;
                     y_coordinate -= 5;
                     break;
                case "1":
                    if(up == true){
                       pencil.setColor(Color.WHITE);
                       pencil.backward(5*consumed);
                       pencil.forward(5*consumed);
                       pencil.setColor(Color.BLACK);
                       pencil.turnLeft(90);
                    }
                    else
                        if (down == true) {
                            pencil.setColor(Color.WHITE);
                            pencil.backward(5*consumed);
                            pencil.forward(5*consumed);
                            pencil.setColor(Color.BLACK);
                            pencil.turnRight(90);
                        }
                        else
                            if(right == true) {
                               pencil.turnRight(180);
                               //pencil.forward(5 * consumed);
                            }
                            else
                                if (left == false){
                                    pencil.turnLeft(90);
                                }  
                     pencil.backward(5 * consumed);
                     pencil.setColor(Color.WHITE);
                     pencil.forward(5 * consumed);
                     pencil.setColor(Color.BLACK);
                     pencil.forward(5 * consumed - 5);
                     pencil.forward(5);
                     left = true;
                     down = false;
                     right = false;
                     up = false;
                     x_coordinate -= 5;
                     break;
                case "3":
                    if(up == true) {
                        pencil.setColor(Color.WHITE);
                        pencil.backward(5*consumed);
                        pencil.forward(5*consumed);
                        pencil.setColor(Color.BLACK);
                        pencil.turnRight(90);
                    }
                    else
                        if (left == true) {
                            pencil.turnLeft(180);
                            //pencil.forward(5 * consumed);
                        }
                        else
                            if(down == true) {
                               pencil.setColor(Color.WHITE);
                               pencil.backward(5*consumed);
                               pencil.forward(5*consumed);
                               pencil.setColor(Color.BLACK);
                               pencil.turnLeft(90);
                            }
                            else
                                if (right == false){
                                    pencil.turnRight(90);
                                }
                     pencil.backward(5 * consumed);
                     pencil.setColor(Color.WHITE);
                     pencil.forward(5 * consumed);
                     pencil.setColor(Color.BLACK);
                     pencil.forward(5 * consumed - 5);
                     pencil.forward(5);
                     right = true;
                     down = false;
                     up = false;
                     left = false;
                     x_coordinate += 5;
                     break;
                case "print":
                     System.out.print(x_coordinate + "," + y_coordinate);
                     System.out.print(x + "," + y);
                     break;
                case "c":
                     grid.up();
                     grid.setColor(Color.GREEN);
                     grid.move(x_coordinate, y_coordinate);
                     grid.down();
                     grid.drawCircle(3);
                default:
                    break;
            } 
        }
    }
}
