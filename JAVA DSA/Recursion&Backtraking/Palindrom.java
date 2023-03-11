import java.util.Scanner;
public class Palindrom 
{
    public static int reverse(int n,int temp) 
    {
        if(n==0)
        return 0;
        temp=temp*10+n%10;
        return reverse(n/10,temp);
    }
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=reverse(n,0);
        System.out.println(a);
    }
}