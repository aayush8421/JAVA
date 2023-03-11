import java.util.*;
public class leapYear
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the year");
        int year = in.nextInt();
        if(year%4==0)
        {
            System.out.println("LEAP YEAR");
        }
        else
        {
            System.out.println("NOT A LEAP YEAR");
        }
        in.close();
    }
    
}
