public class longest1s 
{
    public static int longestChainOf1s(int a[])
    {
        int c=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==1)
            {
                c++;
                if(c>max)
                {
                    max=c;
                }
            }
            else
            c=0;
        }
        return max;
    }
    public static void main(String[] args) 
    {
        int a[]={1,1,1,0,0,1,0,1,1,1,1,0,1};
        System.out.println("Maximum no of 1s in a chain: " + longestChainOf1s(a));    
    }
}
