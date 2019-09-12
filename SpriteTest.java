import java.util.*;
import chn.util.*;
import apcslib.*;
/**
 * Write a description of class SpriteTest here.
 *
 * @author (Ethan Davies)
 * @version (V.1)
 */
public class SpriteTest
{
    // instance variables - replace the example below with your own
    private int x;
    SketchPad canvas;
    DrawingTool pencil;
    int input = 0;
    ConsoleIO typer;
    boolean down, up, left, right;
    /**
     * Constructor for objects of class SpriteTest
     */
    public SpriteTest()
    {
        // initialise instance variables
        canvas = new SketchPad(500,500);
        pencil = new DrawingTool();
        typer = new ConsoleIO();
        pencil.setWidth(1);
    }

    
    public void main()
    {
        pencil.home();
        while(input != 9)
        {
            input = typer.readInt();
            switch (input)
            {
                case 5:
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
                     pencil.forward(5);
                     up = true;
                case 2:
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
                     pencil.forward(5);
                     down = true;
                case 1:
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
                     pencil.forward(5);
                     left = true;
                case 3:
                    if(up == true) {
                        pencil.turnRight(180);
                    }
                    else
                        if (left == true) {
                            pencil.turnLeft(180);
                        }
                        else
                            if(down == true) {
                                pencil.turnLeft(90);
                            }
                     pencil.forward(5);
                     right = true;
            } 
        }
    }
}
