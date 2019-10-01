import java.util.*;
import java.util.Random;
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Permutation
{
    // instance variables - replace the example below with your own
    int x[];

    Random rand;
    /**
     * Constructor for objects of class Palindrome
     */
    public Permutation()
    {
        // initialise instance variables
        x = new int[10];
        rand = new Random();
    }

    
    public void numbers()
    {
        // put your code here
        int i, j, k;
        int hold;
        int r;
        
        for (i=0; i<10; i++)
        {
            x[i] = i + 1;
        }
        System.out.println();
        for (i = 0; i<10; i++)
        {
            System.out.printf("List %2d:", x[i]);
            for (j = 0; j < 10; j++)
            {
                r = rand.nextInt(10);
                hold = x[j];
                x[j] = x[r];
                x[r] = hold;
                
            }
            for (k=0; k<10; k++)
            {
                System.out.printf("%3d", x[k]);
            }
            System.out.println();
        }
    }
}
