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
    int forward_initial;
    DrawingTool pencil;
    SketchPad paper;
    Color shade;
    /**
     * Constructor for objects of class DrawObject
     */
    public DrawObject(int sides, int angle, int initial_forward, int red, int blue, int green)
    {
        // initialise instance variables
        num_sides = sides;
        angle_size = angle;
        forward_initial = initial_forward;
        paper = new SketchPad(500, 500); 
        pencil = new DrawingTool(paper);
        shade = new Color(red,blue,green);
        pencil.setColor(shade);
    }

    public void Art()
    {
       pencil.up();
       pencil.home();
       pencil.down();
       pencil.drawCircle(50);
       pencil.up();
       pencil.forward(forward_initial);
       pencil.down();
       pencil.turnRight(90);
       pencil.forward(50);
       for(x = 0; x<num_sides; x++){
           pencil.turnRight(angle_size);
           pencil.forward(100); 
       }
    }
}
