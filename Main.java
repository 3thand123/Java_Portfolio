import java.util.*;
import chn.util.*;
/**
 * Write a description of class Main here.
 *
 * @author (Ethan Davies)
 * @version (V.1)
 */
public class Main
{
    public Main()
    {
        int choice;
        String repeat;
    
        ConsoleIO InputStream = new ConsoleIO();
        
        do
        {
            System.out.print("Please enter what program you want to run:\n");
            System.out.print("1.Monkeys\n");
            System.out.print("2.Draw Shape\n");
            System.out.print("3.Etch a Sketch\n");
            System.out.print("4.Move dot\n");
            choice = InputStream.readInt();
            switch(choice)
            {
                case 1:
                    {
                        CountdownSong monkeys = new CountdownSong();
                        monkeys.main();
                        break;
                    }
                case 2:
                    {
                        ChooseShape drawing = new ChooseShape();
                        drawing.main();
                        break;
                    }   
                case 3:
                    {
                       SpriteTest line = new SpriteTest();
                       line.main();
                       break;
                    }
                case 4:
                    {
                       MoveDot dot = new MoveDot();
                       dot.main();
                       break;
                    }   
               }
            System.out.print("Would you like to play again?\n");
            System.out.print("Yes/No\n");
            repeat = InputStream.readLine();
         }while("yes".equals(repeat));
    }
}
//this is a comment