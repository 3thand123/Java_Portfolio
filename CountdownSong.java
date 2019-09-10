import chn.util.*;
/**
 * Basics for programming in Java
 *
 * @author (John Mortensen)
 * @version (a version number or a date)
 */
public class CountdownSong
{ // everything in Java is a class, we will learn more latter
    
    public static void main()
    { // code blocks are in curly braces {}
        // initialise control variables for program
       
        ConsoleIO keyboard = new ConsoleIO();
        
        int countdown = 0; 
        String bedJumpers = "hello";// integrer variable assignment, statements end in semi colon
        //BedJumpers bedJumperObject = new BedJumpers(countdown, bedJumpers); // string of characters 
       
        System.out.print("Please enter the name of the jumpers");
        bedJumpers = keyboard.readLine();
        System.out.print("Please enter the number of " + bedJumpers +" you want");
        countdown = keyboard.readInt();
        
        BedJumpers bedJumperObject = new BedJumpers(countdown, bedJumpers);
        
        // prepare for countdown loop
        int i = bedJumperObject.countdown;
        String space = " ";
        while (i > 0) 
        { // while is a control flow statement, observe blocks of code
            bedJumperObject.print();
            i--;
            bedJumperObject.countdown = i;
        } 
        System.out.println("Zero little" + space + bedJumperObject.Bedjumpers);
    }
}
