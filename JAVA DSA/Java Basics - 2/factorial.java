import java.util.*;
public class factorial 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int f=fact(n);
        System.out.println("The factorial: "+f);
        in.close();
    }
    public static int fact(int n) 
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
}
