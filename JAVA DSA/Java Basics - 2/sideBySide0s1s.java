import java.util.*;
public class sideBySide0s1s 
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
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]<a[j+1])
                {
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println("0s and 1s side by side:");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        in.close();
    }
}
