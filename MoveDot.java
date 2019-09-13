import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
/**
 * Write a description of class SpriteTest here.
 *
 * @author (Ethan Davies)
 * @version (V.1)
 */
public class MoveDot
{
    // instance variables - replace the example below with your own
    private int x;
    SketchPad canvas;
    DrawingTool pencil;
    String input = "0";
    ConsoleIO typer;
    Color color;
    int radius = 10;
    boolean down, up, left, right;
    /**
     * Constructor for objects of class SpriteTest
     */
    public MoveDot()
    {
        // initialise instance variables
        canvas = new SketchPad(500,500);
        pencil = new DrawingTool(canvas);
        typer = new ConsoleIO();
        pencil.setWidth(1);
    }

    
    public void main()
    {
        pencil.home();
        while(!"stop".equals(input))
        {
            input = typer.readLine();
            switch (input)
            {
                case "5":
                    if(down == true){
                       pencil.turnLeft(180);
                    }
                    else
                        if (left == true){
                            pencil.turnRight(90);
                        }
                        else
                            if(right == true){
                                pencil.turnLeft(90);
                            }
                     pencil.setColor(Color.WHITE);
                     pencil.backward(5);
                     pencil.forward(5);
                     pencil.setColor(Color.BLACK);
                     pencil.forward(5);
                     up = true;
                     down = false;
                     right = false;
                     left = false;
                     break;
                case "2":
                    if(up == true){
                      pencil.turnLeft(180);
                    }
                    else
                        if (left == true){
                            pencil.turnLeft(90);
                        }
                        else
                            if(right == true){
                               pencil.turnRight(90);
                            }
                            else
                                if (down == false){
                                    pencil.turnRight(180);
                                }  
                     pencil.forward(5);
                     down = true;
                     up = false;
                     right = false;
                     left = false;
                     break;
                case "1":
                    if(up == true){
                        pencil.turnLeft(90);
                    }
                    else
                        if (down == true) {
                            pencil.turnRight(90);
                        }
                        else
                            if(right == true) {
                               pencil.turnRight(180);
                            }
                            else
                                if (left == false){
                                    pencil.turnLeft(90);
                                }  
                     pencil.forward(5);
                     left = true;
                     down = false;
                     right = false;
                     up = false;
                     break;
                case "3":
                    if(up == true) {
                        pencil.turnRight(90);
                    }
                    else
                        if (left == true) {
                            pencil.turnLeft(180);
                        }
                        else
                            if(down == true) {
                                pencil.turnLeft(90);
                            }
                            else
                                if (right == false){
                                    pencil.turnRight(90);
                                }  
                     pencil.forward(5);
                     right = true;
                     down = false;
                     up = false;
                     left = false;
                     break;
                case "c":
                     pencil.drawCircle(radius);
                     break;
                case "r":
                     radius = typer.readInt();
                     break;
                default:
                    break;
            } 
        }
    }
}
