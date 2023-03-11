import java.util.*;
public class smallest 
{
    public static int Smallest(int a,int b,int c) 
    {
        if(a<b)
        {
            if(a<c)
            return a;
            else
            return c;
        }
        else
        {
            if(b<c)
            return b;
            else
            return c;
        }
    }
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 numbers:");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        int s=Smallest(a,b,c);
        System.out.println("The smallest no: "+s);
        in.close();
    }
}
