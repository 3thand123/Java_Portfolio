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
        int repeat;
    
        ConsoleIO InputStream = new ConsoleIO();
        CountdownSong monkeys = new CountdownSong();
        ChooseShape drawing = new ChooseShape();
        
        do
        {
            System.out.print("Please enter what program you want to run:\n");
            System.out.print("1.Monkeys\n");
            System.out.print("2.Draw Shape\n");
            choice = InputStream.readInt();
            switch(choice)
            {
                case 1:
                    {
                        monkeys.main();
                        break;
                    }
                case 2:
                    {
                        drawing.main();
                        break;
                    }   
               }
            System.out.print("Would you like to play again?\n");
            System.out.print("1. Yes\n");
            System.out.print("2. No\n");
            repeat = InputStream.readInt();
         }while(repeat == 1);
    }
}
//this is a comment