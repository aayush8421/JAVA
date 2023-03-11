import java.util.*;
public class basiccalculator 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("Enter the operator");
        char c=in.next().charAt(0);
        int p=0;
        switch(c)
        {
            case '+':
            p=a+b;
            break;
            case '-':
            p=a-b;
            break;
            case '*':
            p=a*b;
            break;
            case '%':
            p=a%b;
            break;
            case '/':
            p=a/b;
            break;
            default:
            System.out.println("Wrong operator");
        }
        System.out.println(a+" "+(char)c+" "+b+"="+p);
        in.close();
    }
}
