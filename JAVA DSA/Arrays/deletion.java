public class deletion 
{
    public static void deleteElement(int a[],int k)
    {
        int i;
        for(i=0;i<a.length;i++)
        {
            if(a[i]==k)
            break;
        }
        if(i==a.length) return; 
        for(int j=i;j<a.length-1;j++)
        {
            a[j]=a[j+1];
        }
    }
    public static void main(String[] args) 
    {
        int a[]={4,6,3,7,1};
        int k=3;
        deleteElement(a,k);
        for(int e: a) {
			System.out.print(e+" ");
		}  
    }
}
