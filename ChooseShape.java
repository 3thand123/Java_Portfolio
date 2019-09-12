import java.util.*;
import chn.util.*;
import apcslib.*;
import java.awt.Color;
 
public class ChooseShape
{
    int sides, angle;
    double apothem;
    int initial_forward;
    int red,green,blue;
    String color;
    public void main()
    {
        ConsoleIO keyboard = new ConsoleIO();
        DrawingTool pencil;
        SketchPad paper;
        DrawObject drawing;
        paper = new SketchPad(500, 500); 
        pencil = new DrawingTool(paper);
        input(keyboard);
        drawing = new DrawObject(sides, angle, initial_forward, red, green, blue);
        getColor(pencil, keyboard);
        drawing.Art();
    }
    
    public void input(ConsoleIO keyboard)
    {
       System.out.print("Please enter the number of sides you wish your shape to have");
       sides = keyboard.readInt();
       angle = 180 - ((sides - 2) * 180)/sides;
       apothem = (100)/(2*(Math.tan(3.14/sides)));
       initial_forward =(int)apothem;
       System.out.print("Please enter the red value of the color you want");
       red = keyboard.readInt();
       System.out.print("Please enter the blue value of the color you want");
       blue = keyboard.readInt();
       System.out.print("Please enter the green value of the color you want");
       green = keyboard.readInt();
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
