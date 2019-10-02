import java.util.*;
import chn.util.*;
import java.lang.String;
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    // instance variables - replace the example below with your own
    String input;
    String reverse;
    
    int length;
    
    ConsoleIO in;

    /**
     * Constructor for objects of class Palindrome
     */
    public Palindrome()
    {
        // initialise instance variables
        in = new ConsoleIO();
        length = 0;
        reverse = "";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void friend()
    {
        // put your code here
        int i;
        
        String temp;
        char letter;
        
        System.out.print("Please enter your word:\n");
        input = in.readLine();
        
        temp = input;
        
        temp = temp.replaceAll("[\\W]", "");
        
        temp = temp.toLowerCase();
        
        length = temp.length();
        
        for(i = length - 1; i >= 0; i--)
        {
            letter = temp.charAt(i);
            
            reverse += letter;
        }
        
        length = input.length();
        
        for(i = length-1; i >= 0; i--)
        {
            System.out.print(input.charAt(i));
        }
        
        System.out.print("\n");
        
        if(reverse.equals(temp))
        {
           System.out.print("PALINDROME\n");
        }
        else
        {
            System.out.print("NOT PALINDROME\n");
        }
            
            
    }
}
