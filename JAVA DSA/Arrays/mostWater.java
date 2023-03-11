//CONTAINER WITH MOST WATER
//2 POINTER APPROACH
public class mostWater 
{
    public static int containerWithMostWater(int a[])
    {
        int maxarea=0;
        int l=0;
        int r=a.length-1;
        while(l<r)
        {
            int height=Math.min(a[l],a[r]);
            int dist=r-l;
            int area=height*dist;
            maxarea=Math.max(maxarea,area);
            if(a[l]<a[r])
            l++;
            else
            r--;
        }
        return maxarea;
    }
    public static void main(String[] args) 
    {
        int a[]={1,8,6,2,4,5,8,3,7};
        System.out.println("The maximum area: " + containerWithMostWater(a));
    }
}
