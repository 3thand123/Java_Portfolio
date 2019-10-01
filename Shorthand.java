import java.util.*;
import chn.util.*;
import java.lang.String;
/**
 * Write a description of class Shorthand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shorthand
{
    // instance variables - replace the example below with your own
    String input;
    String parts[];
    String test;  
    

    
    int i, x;
    
    ConsoleIO streamer;

    /**
     * Constructor for objects of class Shorthand
     */
    public Shorthand()
    {
        // initialise instance variables
        streamer = new ConsoleIO();

    }

    
    public void translate()
    {
        System.out.print("Please enter a sentence:\n");
        input = streamer.readLine();
        parts = input.split(" ");
        
        for(i = 0; i < parts.length; i++)
        {
            test = parts[i];
            test = test.toLowerCase();
            switch(test)
            {
                case "and":
                {
                    parts[i] = "&";
                    break;
                }
                case "to":
                {
                    parts[i] = "2";
                    break;
                }
                case "you":
                {
                    parts[i] = "U";
                    break;
                }
                case "for":
                {
                    parts[i] = "4";
                    break;
                }
            }
            
            test = parts[i];
            
            for (x = 0; x < test.length(); x++)
            {
                switch(test.charAt(x))
                {
                    case 'a':case 'e':case 'i':case 'o':case 'u':
                        {
                            test = test.replace(test.charAt(x), ' ');
                            test = test.replaceAll(" ", "");
                            x--;
                            parts[i] = test;
                            break;
                        }
                }
            }
            System.out.print(parts[i] + " ");
        }
        System.out.print("\n");
    }
}
