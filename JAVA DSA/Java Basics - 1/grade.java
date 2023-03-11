import java.util.*;
public class grade
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter marks:");
        int marks = in.nextInt();
        if(marks>=90)
        System.out.println("GRADE A");
        else if(marks>=60)
        System.out.println("GRADE B");
        else
        System.out.println("GRADE C");
        in.close();
    }
    
}
