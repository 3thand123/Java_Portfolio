
public class DrawObject
{
    // instance variables - replace the example below with your own
    private int x,y;
    int num_sides;
    int angle_size;
    double initial_forward;
    double height;
    
    /**
     * Constructor for objects of class DrawObject
     */
    public DrawObject(int sides, int angle, double apothem, int initial_forward)
    {
        // initialise instance variables
        num_sides = sides;
        angle_size = angle;
        height = apothem;
        initial_forward = initial_forward;
    }

    public int sampleMethod()
    {
        // put your code here
        return x + y;
    }
}
