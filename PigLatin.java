import java.util.*;
import chn.util.*;
import java.lang.String;
import java.lang.*;
/**
 * Write a description of class PigLatin here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PigLatin
{
    // instance variables - replace the example below with your own
    String input;
    String parts[];
    String pieces[];
    
    ConsoleIO hal;
    
    /**
     * Constructor for objects of class PigLatin
     */
    public PigLatin()
    {
        // initialise instance variables
        hal = new ConsoleIO();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void oink()
    {
        // put your code here
        int i,j, k;
        int vowels = 0;
        
        String FirstVowel = "";
        char firstVowel;
        
        
        char letters[];
        
        boolean isChar;
        
        System.out.print("Please enter your word:\n");
        input = hal.readLine();
        
        parts = input.split(" ");
        
        for(i = 0; i < parts.length; i++)
        {
            vowels = 0;
            if(!ch.isLetter('a'))
                break;
            for(j = 0; j < parts[i].length(); j++)
            {
                vowels += vowel(parts[i].charAt(j));
            }
            if(vowels == 0)
            {
                System.out.print(parts[i] + "ay");
            }
            else 
                if(vowels >= 1 && vowel(parts[i].charAt(0)) == 1)
                {
                    System.out.print(parts[i] + "yay");
                }
                else
                {
                    vowels = 0;
                    j = 0;
                    while(vowels == 0)
                    {
                        vowels += vowel(parts[i].charAt(j));
                        if(vowels==0)
                            j++;
                    }
                    firstVowel = parts[i].charAt(j);
                    
                    int charType;
                    
                    charType = Character.getType(parts[i].charAt(0));
                                   
                    parts[i] = parts[i].toLowerCase();
                    
                    letters = parts[i].toCharArray();
                    if(charType == Character.UPPERCASE_LETTER)
                        letters[j] = Character.toUpperCase(letters[j]);
                    
                    for(k = j; k<parts[i].length(); k++)
                         System.out.print(letters[k]);
                    for(k = 0; k < j; k++)  
                        System.out.print(letters[k]);
                    System.out.print("ay");
                }
            System.out.print(" ");
        }
         System.out.print("\n");
    }
    
    public int vowel(char check)
    {
        int result = 0;
        
        switch(check)
                {
                    case 'a':case'A':case 'e':case'E':case'i':case'I':case'o':case'O':case'u':case'U':
                        result = 1;
                }
        
        return result;
    }

}
