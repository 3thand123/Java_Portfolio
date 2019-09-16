import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class Snake here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Snake
{
    // instance variables - replace the example below with your own
    DrawingTool snakeman;
    boolean down, up, left, right;
    int snakeX, snakeY;
    //String input;
    ConsoleIO typer;
    int injested;
    /**
     * Constructor for objects of class Snake
     */
    public Snake(SketchPad canvas)
    {
        // initialise instance variables
        snakeman = new DrawingTool(canvas);
        down = false;
        up = false;
        left = false;
        right = false;
        snakeX = 0; 
        snakeY = 0;
        typer = new ConsoleIO();
        injested = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void move(String input, int injested)
    {
        
            switch (input)
            {
                case "5":
                    if(down == true){
                       snakeman.turnLeft(180);
                        //snakeman.forward(5 * consumed);
                    }
                    else
                        if (left == true){
                            snakeman.setColor(Color.WHITE);
                            snakeman.backward(5*injested);
                            snakeman.forward(5*injested);
                            snakeman.setColor(Color.BLACK);
                            snakeman.turnRight(90);
                        }
                        else
                            if(right == true){
                                snakeman.setColor(Color.WHITE);
                                snakeman.backward(5*injested);
                                snakeman.forward(5*injested);
                                snakeman.setColor(Color.BLACK);
                                snakeman.turnLeft(90);
                            }
                     snakeman.backward(5 * injested);
                     snakeman.setColor(Color.WHITE);
                     snakeman.forward(5 * injested);
                     snakeman.setColor(Color.BLACK);
                     snakeman.forward((5 * injested) - 5);
                     snakeman.forward(5);
                     up = true;
                     down = false;
                     right = false;
                     left = false;
                     snakeY += 5;
                     break;
                case "2":
                    if(up == true){
                      snakeman.turnLeft(180);
                      //snakeman.forward(5 * consumed);
                    }
                    else
                        if (left == true){
                            snakeman.setColor(Color.WHITE);
                            snakeman.backward(5*injested);
                            snakeman.forward(5*injested);
                            snakeman.setColor(Color.BLACK);
                            snakeman.turnLeft(90);
                        }
                        else
                            if(right == true){
                               snakeman.setColor(Color.WHITE);
                               snakeman.backward(5*injested);
                               snakeman.forward(5*injested);
                               snakeman.setColor(Color.BLACK);
                               snakeman.turnRight(90);
                            }
                            else
                                if (down == false){
                                    snakeman.turnRight(180);
                                } 
                     snakeman.backward(5 * injested);
                     snakeman.setColor(Color.WHITE);
                     snakeman.forward(5 * injested);
                     snakeman.setColor(Color.BLACK);
                     snakeman.forward(5 * injested - 5);
                     snakeman.forward(5);
                     down = true;
                     up = false;
                     right = false;
                     left = false;
                     snakeY -= 5;
                     break;
                case "1":
                    if(up == true){
                       snakeman.setColor(Color.WHITE);
                       snakeman.backward(5*injested);
                       snakeman.forward(5*injested);
                       snakeman.setColor(Color.BLACK);
                       snakeman.turnLeft(90);
                    }
                    else
                        if (down == true) {
                            snakeman.setColor(Color.WHITE);
                            snakeman.backward(5*injested);
                            snakeman.forward(5*injested);
                            snakeman.setColor(Color.BLACK);
                            snakeman.turnRight(90);
                        }
                        else
                            if(right == true) {
                               snakeman.turnRight(180);
                               //snakeman.forward(5 * consumed);
                            }
                            else
                                if (left == false){
                                    snakeman.turnLeft(90);
                                }  
                     snakeman.backward(5 * injested);
                     snakeman.setColor(Color.WHITE);
                     snakeman.forward(5);
                     snakeman.setColor(Color.BLACK);
                     snakeman.forward(5 * injested - 5);
                     snakeman.forward(5);
                     left = true;
                     down = false;
                     right = false;
                     up = false;
                     snakeX -= 5;
                     break;
                case "3":
                    if(up == true) {
                        snakeman.setColor(Color.WHITE);
                        snakeman.backward(5*injested);
                        snakeman.forward(5*injested);
                        snakeman.setColor(Color.BLACK);
                        snakeman.turnRight(90);
                    }
                    else
                        if (left == true) {
                            snakeman.turnLeft(180);
                            //snakeman.forward(5 * consumed);
                        }
                        else
                            if(down == true) {
                               snakeman.setColor(Color.WHITE);
                               snakeman.backward(5*injested);
                               snakeman.forward(5*injested);
                               snakeman.setColor(Color.BLACK);
                               snakeman.turnLeft(90);
                            }
                            else
                                if (right == false){
                                    snakeman.turnRight(90);
                                }
                     snakeman.backward(5 * injested);
                     snakeman.setColor(Color.WHITE);
                     snakeman.forward(5);
                     snakeman.setColor(Color.BLACK);
                     snakeman.forward(5 * injested - 5);
                     snakeman.forward(5);
                     right = true;
                     down = false;
                     up = false;
                     left = false;
                     snakeX += 5;
                     break;
                default:
                    break;
            } 
        
    }
}
