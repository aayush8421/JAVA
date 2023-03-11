import java.util.*;
public class swap 
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the two numbers:");
        int a= in.nextInt();
        int b= in.nextInt();
        System.out.println("Before swapping a: " + a + " and b: " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a: " + a + " and b: " + b);
        in.close();
    }
    
}
