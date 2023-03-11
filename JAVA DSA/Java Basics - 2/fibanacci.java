import java.util.*;
public class fibanacci 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n=in.nextInt();
        int a=0;
        int b=1;
        int c=0;
        System.out.println("The fibonacci series:");
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
        in.close();
    }
}
