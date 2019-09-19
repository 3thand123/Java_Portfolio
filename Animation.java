
import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
import java.awt.geom.Point2D; 
/**
 * Write a description of class Animation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Animation
{
    // instance variables - replace the example below with your own
    int a;
    double t;
    SketchPad canvas;
    DrawingTool pencil, eraser, character;
    Snake hero;
    Point2D position;
    double pX, pY, eX, eY;
    Random rand;
    ConsoleIO typer;
    
    /**
     * Constructor for objects of class Animation
     */
    public Animation()
    {
        // initialise instance variables
        canvas = new SketchPad(50,50);
        pencil = new DrawingTool(canvas);
        eraser = new DrawingTool(canvas);
        character = new DrawingTool(canvas);
        hero = new Snake(canvas);
        rand = new Random();
        typer = new ConsoleIO();
        t = rand.nextInt(359) + 1;
        pX = 0.0;
        pY = 0.0;
        eX = 0.0;
        eY = 0.0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void main()
    {
        pencil.up();
        pencil.move(58.5,58.5);
        pencil.down();
        pencil.move(58.5,-58.5);
        pencil.move(-58.5,-58.5);
        pencil.move(-58.5,58.5);
        pencil.move(58.5,58.5);
        
    
        pencil.up();
        pencil.home();
        pencil.down();
        eraser.down();
        pencil.turnRight(t);
        eraser.turnRight(t);
        eraser.backward(1);
        while(1==1)
        {
            //moveVillain(pencil, eraser);
            //check(pencil, eraser);
            moveCharacter(character);
            
        }
        
        
    }
    
    public void moveCharacter (DrawingTool character)
    {
        String input;
        input = typer.readLine();
        hero.move(input, 0);
    }
    
    public void moveVillain (DrawingTool pencil, DrawingTool eraser)
    {
        pencil.setColor(Color.BLACK);
        pencil.forward(1);
        pencil.drawCircle(5);
        eraser.setColor(Color.WHITE);
        eraser.forward(1);
        eraser.drawCircle(5);
        position = pencil.getPosition();
        pX = position.getX();
        pY = position.getY();
        position = eraser.getPosition();
        eX = position.getX();
        eY = position.getY();
    } 
    
    public void check(DrawingTool pencil, DrawingTool eraser)
    {
        if(pX>=50)
            {
               pencil.turnLeft(t);
            }
        if(pY>=50)
            {
                pencil.turnLeft(t);
            }
        if(pX<=-50)
            {
                pencil.turnRight(t);
            }
        if(pY<=-50)
            {
                pencil.turnRight(t);
            }
            
         if(eX>=50)
            {
                eraser.turnLeft(t);
            }
        if(eY>=50)
            {
                eraser.turnLeft(t);
            }
        if(eX<=-50)
            {
                eraser.turnRight(t);
            }
        if(eY<=-50)
            {
                eraser.turnRight(t);
            }
    }
}



