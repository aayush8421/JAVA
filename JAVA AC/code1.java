import java.util.*;
public class code1 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0)
        {
          int k=0;
            int a=Integer.valueOf(in.next());
            int b=Integer.valueOf(in.next());
            int c=Integer.valueOf(in.next());
            if(a==7||b==7||c==7)
            {
                k++;
            }
            if(k==1)
            System.out.println("YES");
            else
            System.out.println("NO");
            --t;
        }
        in.close();
    }
    
}
