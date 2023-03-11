import java.util.*;
public class greatest
{
    public static void main(String args[])
    {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a>b)
        {
            if(a>c)
            System.out.println("Grestest no:" + a);
            else
            System.out.println("Greatest no:" + c);
        }
        else
        {
            if(b>c)
            System.out.println("Grestest no:" + b);
            else
            System.out.println("Greatest no:" + c);

        }
        in.close();
    }
}
