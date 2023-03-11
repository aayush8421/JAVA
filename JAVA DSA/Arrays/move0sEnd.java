//MOVE ALL ZEROS TO THE END OF THE GIVEN ARRAY
//INPUT: 8,0,1,3,0,0,5
//OUTPUT: 8,1,3,5,0,0,0
public class move0sEnd 
{
    public static void move0sToLast(int a[])
    {
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]!=0)
            a[j++]=a[i];
        }
        for(int i=j;i<a.length;i++)
        {
            a[i]=0;
        }
        for(int e:a)
        System.out.print(e+" ");
    }
    public static void main(String[] args) 
    {
        int a[]={8,0,1,3,0,0,5};
        move0sToLast(a);
    }
}
