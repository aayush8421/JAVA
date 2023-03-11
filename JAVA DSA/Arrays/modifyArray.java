// Wap to replace every element with the greatest element on its right side
// output:
// input array: 7 5 8 9 6 8 5 7 4 6
// modified array: 9 9 9 8 8 7 7 6 6 0 
public class modifyArray 
{
    /**    O(n^2)
    public static void main(String[] args) 
    {
        int a[]={7,5,8,9,6,8,5,7,4,6};
        for(int i=0;i<a.length;i++)
        {
            a[i]=0;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]>a[i])
                a[i]=a[j];
            }
        }
        for(int e:a)
        System.out.println(e+" ");
    }*/

    public static void main(String[] args) 
    {
        int a[]={7,5,8,9,6,8,5,7,4,6};
        //a[a.length-1]=0;
        int b=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]<b)
            a[i]=b;
            else
            b=a[i];
        }
        for(int e:a)
        System.out.println(e+" ");
    }
}
