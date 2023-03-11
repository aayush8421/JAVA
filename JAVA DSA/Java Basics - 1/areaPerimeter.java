import java.util.*;
public class areaPerimeter
{
    public static void main(String args[]) 
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the radius:");
        double r = in.nextDouble();
        double area = 3.14*r*r;
        double perimeter = 2*3.14*r;
        System.out.println("The area:" + area);
        System.out.println("The perimeter:" + perimeter);
        in.close();
    }
}
