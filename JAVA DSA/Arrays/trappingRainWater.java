//TRAPPING RAIN WATER PROBLEM
//FIRST FIND LEFT MAX ARRAY
//THEN FIND RIGHT MAX ARRAY
//THEN CALCULATE
public class trappingRainWater 
{
    public static int trappingRainWaterProblem(int a[])
    {
        int l[]=new int[a.length];
        int r[]=new int[a.length];
        l[0]=a[0];
        for(int i=1;i<a.length;i++)
        {
            l[i]=Math.max(a[i],l[i-1]);
        }
        r[a.length-1]=a[a.length-1];
        for(int i=a.length-2;i>=0;i--)
        {
            r[i]=Math.max(a[i],r[i+1]);
        }
        int tot=0;
        for(int i=0;i<a.length;i++)
        {
            tot=tot + (Math.min(l[i],r[i])-a[i]);
        }
        return tot;
    }
    public static void main(String[] args) 
    {
        int a[]={1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total trapped water units: "+trappingRainWaterProblem(a));
    }
}
