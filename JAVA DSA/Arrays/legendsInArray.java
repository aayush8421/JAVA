//LENGENDS ARE THOSE ELEMENTS WHO DO NOT HAVE ANY GREATER ELEMENT TO THEIR RIGHT
public class legendsInArray 
{
    public static void legendsInAnArray(int a[])
    {
        int largest=Integer.MIN_VALUE;
        int b[]=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(a[i]>largest)
            {
                largest=a[i];
                //System.out.println(largest);
                b[j++]=a[i];
            }
        }
        for(int i=j-1;i>=0;i--)
        System.out.println(b[i]);
    }
    public static void main(String[] args) 
    {
        int a[]={2,7,6,4,1,3};
        legendsInAnArray(a);
    }
}
