
/**
 * Write a description of class BedJumpers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BedJumpers
{
    int countdown;
    String Bedjumpers;
    String space = " ";
    public BedJumpers(int numjumps, String name)
    {
        countdown = numjumps;
        Bedjumpers = name;
    }

    public void print()
    {
        System.out.println(countdown + space + "little" + space + Bedjumpers + space + "jumping on the bed");
        System.out.println("One fell off and broke his head");
        System.out.println("Mama called the doctor and the doctor said");
        System.out.println("no more " + Bedjumpers + " jumping on the bed.");
    }
}
