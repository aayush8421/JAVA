public class largest2nd3rd  
{
    public static int secondMax(int a[])
    {
        if(a.length<2) return -1;
        int largest=0;
        int second=-1;
        //int third=-1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>a[largest]) 
            {
                //third=second;
                second=largest;
                largest=i;
            }
            else if(a[i] < a[largest]) 
            {
				if(second== -1 || a[i] > a[second]) 
                {
					second=i;
                    //third=second;
                }
            }
            // else if(a[i]<a[second]);
            // {
            //     if(third==-1||a[i]>a[third])
            //     {
            //         third=i;
            //     }
            // }
        }
        return second;
        //return third;
    }
    public static void main(String[] args) 
    {
        int a[]={34,56,23,8,45,32};
        System.out.println("The 3rd largest element is:"+a[secondMax(a)]); 
    }
}
