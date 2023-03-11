import java.util.*;
public class maxMinArray 
{
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=in.nextInt();
        }
        int max=a[0];
        int min=a[0];
        for(int i=1;i<n;i++)
        {
            if(a[i]>max)
            max=a[i];
            if(a[i]<min)
            min=a[i];
        }
        System.out.println("Minimum number in the array: "+ min);
        System.out.println("Maximum number in the array: "+ max);
        in.close();
    }
    
}
