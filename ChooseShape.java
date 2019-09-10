import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
 
public class ChooseShape
{
    int sides, angle;
    double apothem;
    int initial_forward;
    public void main()
    {
        ConsoleIO keyboard = new ConsoleIO();
        DrawingTool pencil;
        SketchPad paper;
        DrawObject drawing;
        paper = new SketchPad(500, 500); 
        pencil = new DrawingTool(paper);
        input(keyboard);
        drawing = new DrawObject(sides, angle, apothem, initial_forward);
        getColor(pencil, keyboard);
        draw(pencil, keyboard);
    }
    
    public void input(ConsoleIO keyboard)
    {
       System.out.print("Please enter the number of sides you wish your shape to have");
       sides = keyboard.readInt();
       angle = 180 - ((sides - 2) * 180)/sides;
       apothem = (100)/(2*(Math.tan(3.14/sides)));
       initial_forward =(int)apothem;
       pencil.up();
       pencil.home();
       pencil.down();
       pencil.drawCircle(50);
       pencil.up();
       pencil.forward(initial_forward);
       pencil.down();
       pencil.turnRight(90);
       pencil.forward(50);
       for(x = 0; x<sides; x++){
           pencil.turnRight(angle);
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
    
    public static void getColor(DrawingTool pencil, ConsoleIO keyboard)
    {
        Color color;
        pencil.setColor(Color.RED);
        /*Color color;
        Color = keyboard.readLine();
        pencil.setColor(Color.color);*/
    }
}
