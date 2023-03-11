//FREQUENCY OF EACH ELEMENT IN A SORTED ARRAY
//COMPLEXITY OF O(n)
public class frequency 
{
    public static void frequencyOfEachElement(int a[])
    {
        int c=0;
        int b=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(b==a[i])
            {
                c++;
            }
            else
            {
                System.out.println("The frequency of "+ a[i-1] + " is: "+c);
                c=0;
                b=a[i];
                c++;
            }
        }
        System.out.println("The frequency of "+ a[a.length-1] + " is: "+c);
    }
    public static void main(String[] args) 
    {
        int a[]={1,2,2,3,4,4,4,5,7,7,9,9,9,10,20,20};
        frequencyOfEachElement(a);
    }
}
