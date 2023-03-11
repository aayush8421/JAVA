//using KADANE'S ALGORITHM
//FIND THE MAXIMUM SUM SUBARRAY AND THE MINIMUM SUM SUBARRAY
public class subArrayMaxMinSum 
{
    public static void maximumMinimumSumSubArray(int a[])
    {
        int curSum=0,start=0,end=0;
        int maxSum=Integer.MIN_VALUE;
        int minSum=Integer.MAX_VALUE;

        //MAXIMUM SUM SUBARRAY
        for(int i=0;i<a.length;i++)
        {
            curSum+=a[i];
            if(curSum<0)
            { 
                curSum=0;
                start=i;
            }
            if(curSum>maxSum) 
            {
                maxSum=curSum;
                end =i;
            }
        }
        System.out.print("The sub array with max sum:");
        for(int i=start+1;i<=end;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("And the max sum is:"+maxSum);

        //MINIMUM SUM SUBARRAY
        for(int i=0;i<a.length;i++)
        {
            curSum+=a[i];
            if(curSum>0)
            { 
                curSum=0;
                start=i;
            }
            if(curSum<minSum) 
            {
                minSum=curSum;
                end =i;
            }
            
        }
        System.out.print("The sub array with min sum:");
        for(int i=start+1;i<=end;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("And the max sum is:"+minSum);
    }
    public static void main(String[] args) 
    {
        int a[]={6,-7,50,-20,1,5,-4};
        maximumMinimumSumSubArray(a);
    }
}
