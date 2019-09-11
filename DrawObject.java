import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
public class DrawObject
{
    // instance variables - replace the example below with your own
    private int x,y;
    int num_sides;
    int angle_size;
    double initial_forward;
    double height;
    DrawingTool pencil;
    SketchPad paper;
    
    /**
     * Constructor for objects of class DrawObject
     */
    public DrawObject(int sides, int angle, double apothem, int initial_forward)
    {
        // initialise instance variables
        num_sides = sides;
        angle_size = angle;
        height = apothem;
        initial_forward = initial_forward;
        paper = new SketchPad(500, 500); 
        pencil = new DrawingTool(paper);
    }

    public int Art()
    {
       pencil.up();
       pencil.home();
       pencil.down();
       pencil.drawCircle(50);
       pencil.up();
       pencil.forward(initial_forward);
       pencil.down();
       pencil.turnRight(90);
       pencil.forward(50);
       for(x = 0; x<num_sides; x++){
           pencil.turnRight(angle_size);
           pencil.forward(100); 
       }
       /*
       pencil.up();
       pencil.home();
       pencil.turnLeft(90);
       pencil.forward(20);
       pencil.turnRight(90);
       pencil.down();
       pencil.drawString("Test 1");

       for(x = 0; x < 100; x++)
       {
           pencil.turnLeft(1);
           pencil.forward(50);
           pencil.drawString("Test 1");
           pencil.turnRight(100);
           pencil.forward(50);
        }
        */
       /*
       pencil.up();
       pencil.home();
       pencil.turnLeft(180);
       pencil.forward(75);
       pencil.turnRight(90);
       pencil.down();
       int y;
       for(x=0; x<100; x++)
       {
           if (x % 10 == 0)
           {
               pencil.drawCircle(25);
           }
           if (x % 15 == 0)
           {
               pencil.drawCircle(50);
           }
           pencil.drawCircle(15);
           pencil.up();
           pencil.forward(5);
           pencil.down();
           pencil.turnRight(3.6); 
           }  
           */
    }
}
