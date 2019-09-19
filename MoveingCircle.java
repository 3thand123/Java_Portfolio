import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
import java.util.Random;
/**
 * Write a description of class MoveingCircle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MoveingCircle
{
    int x, y, z;
    int a, b;
    SketchPad canvas;
    DrawingTool pencil;
    Random rand;
    public MoveingCircle()
    {
        // initialise instance variables
        rand = new Random();
        canvas = new SketchPad(250,250);
        pencil = new DrawingTool(canvas);
        a = 1;
        b = 1;
        x = rand.nextInt(180)-180;
        y = 0;
        z = 0;
    }

    
    public void sampleMethod()
    {
        pencil.turnRight(45);
        while (z==0)
        {
               //pencil.setColor(Color.WHITE);
               //pencil.drawCircle(5);
               //pencil.backward(1);
               //pencil.forward(1);
               pencil.setColor(Color.BLACK);
               pencil.forward(1);
               pencil.drawCircle(5);
               if(x == 250){
                   x = rand.nextInt(180)+90;;
                   pencil.turnLeft(x);}
               if(y == 250){
                   x = rand.nextInt(180)+90;;
                   pencil.turnLeft(x);}
               if(x == -250){
                   x = rand.nextInt(180)-90;
                   pencil.turnRight(x);}
               if(y == -250){
                   x = rand.nextInt(180)-90;
                   pencil.turnRight(x);}
               
        }
       
    }
}
