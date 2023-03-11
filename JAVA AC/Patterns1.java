import java.util.*;
public class Patterns1
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=in.nextInt();
        System.out.println("Enter the no of columns");
        int c=in.nextInt();

        //Solid Rectangle
        // *****
        // *****
        // *****
        // *****
        // *****
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Hollow Rectangle
        // *****
        // *   *
        // *   *
        // *   *
        // *****
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(i==1||j==1||i==r||j==c)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //Half Pyramid
        // *    
        // **   
        // ***  
        // **** 
        // *****
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted half pyramid
        // *****
        // ****
        // ***
        // **
        // *
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted half pyramid(Rotated by 180 deg.)
        //     *
        //    **
        //   ***
        //  ****
        // *****
        for(int i=1;i<=r;i++)
        {
            for(int k=1;k<=(r-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Half pyramid with numbers
        // 1
        // 12
        // 123
        // 1234
        // 12345
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //Inverted half pyramid with numbers
        // 12345
        // 1234
        // 123
        // 12
        // 1
        for(int i=r;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //floyd's triangle
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        int a=0;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(++a+" ");
            }
            System.out.println();
        }
        System.out.println();

        //0-1 triangle
        // 1
        // 01
        // 101
        // 0101
        // 10101
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                System.out.print("1");
                else
                System.out.print("0");
            }
            System.out.println();
        }

        in.close();
    }
}
