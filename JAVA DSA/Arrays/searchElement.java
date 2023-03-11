import java.util.*;
public class searchElement 
{
    public static int elementSearch(int a[],int k)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==k)
            return i;
        }
        return -1;
    }
    public static void main(String[] args) 
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the no of elements:");
        int n =in.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements:");
        for(int i=0;i<n;i++)
        {
            a[i]=in.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int k=in.nextInt();
        int index=elementSearch(a,k);
        if(index==-1)System.out.println("Element not found");
        else System.out.println("Element found at index "+index);
        in.close();
    }
}
