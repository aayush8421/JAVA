public class removeDuplicates 
{
    public static void remove(int a[])
    {
        int j=0;                                  
        for(int i=1;i<a.length;i++)             
        {                                      
            if(a[i]!=a[j])
            {
                a[j+1]=a[i];
                j++;
            }
        }
        for(int i=0;i<j+1;i++)
        System.out.println(a[i]);
    }
    public static void main(String[] args) 
    {
        int a[]={2,2,3,4,5,5,6,7,7,8,8,8,9,10,10};
        remove(a);
        // for(int e:a)
        // System.out.println(e+" ");
    }
}
