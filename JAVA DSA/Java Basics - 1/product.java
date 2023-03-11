import java.util.*;
class product
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("The product:" + a*b);
        in.close();
    }
}