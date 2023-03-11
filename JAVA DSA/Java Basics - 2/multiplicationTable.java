import java.util.*;
public class multiplicationTable 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=in.nextInt();
        System.out.println("The multiplication table is:");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+"*"+i+"="+i*n);
        }
        in.close();
    }
    
}
