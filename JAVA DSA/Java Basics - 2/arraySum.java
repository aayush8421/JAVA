import java.util.*;
public class arraySum 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array:");
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
            sum+=a[i];
        }
        System.out.println("The sum: "+sum);
        in.close();
    }
    
}
