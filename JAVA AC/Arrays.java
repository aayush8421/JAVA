import java.util.*;
public class Arrays 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=in.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements in the array: ");
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }

        //Finding min and max elements in an array
        int max=arr[0];
        int min=arr[0];
        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
            max=arr[i];
            if(arr[i]<min)
            min=arr[i];
        }
        System.out.println("The maximum no is: "+max);
        System.out.println("The minimum no is: "+min);

        //Checking whether array is sorted or not
        int f=0;
        for(int i=0;i<size-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                f=0;
                break;
            }
            else
            f=1;
        }
        if(f==1)
        System.out.println("The array is in sorted ascending order");
        else
        System.out.println("The array is not in sorted ascending order");
        in.close();
    }
    
}