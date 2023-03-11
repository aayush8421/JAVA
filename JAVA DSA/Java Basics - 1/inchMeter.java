import java.util.*;
public class inchMeter
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number in inches:");
        double a = in.nextDouble();
        double b = a*0.0254;
        System.out.println("The number in meters is:" + b);
        in.close();
    }
    
}
