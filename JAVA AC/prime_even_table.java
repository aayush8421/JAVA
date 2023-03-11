import java.util.*;
public class prime_even_table 
{
    // Prime no
    // public static int isPrime(int n)
    // {
    //     int c=0;
    //     for(int i=1;i<=n;i++)
    //     {
    //         if(n%i==0)
    //         c++;
    //     }
    //     if(c==2)
    //     return 1;
    //     else
    //     return 0;
    // }

    // Even no
    // public static int isEven(int n)
    // {
    //     if(n%2==0)
    //     return 1;
    //     else
    //     return 0;
    // }

    //Table
    public static void printTable(int n)
    {
        System.out.println("The multiplication table for "+n+":");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"X"+i+"="+n*i);
        }
    }

    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();

        // if(isEven(n)==1)
        // System.out.println("Even No");
        // else
        // System.out.println("Not a Even no");

        printTable(n);

        in.close();
    }
    
}
