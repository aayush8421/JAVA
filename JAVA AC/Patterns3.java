import java.util.*;
public class Patterns3 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Limit");
        int n=in.nextInt();


        //Hollow Butterfly Pattern (n=5)
        //*        *
        //**      **
        //* *    * *
        //*  *  *  *
        //*   **   *
        //*   **   *
        //*  *  *  *
        //* *    * *
        //**      **
        //*        *
        //Upper Half
        for(int i=1;i<=n;i++)
        {
            //1st part
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }

            //spaces
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        //Lpper Half
        for(int i=n;i>=1;i--)
        {
            //1st part
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }

            //spaces
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //Hollow Rhombus Pattern
        //    *****
        //   *   *
        //  *   *
        // *   *
        //*****
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=n;j++)
            {
                if(i==1||j==1||i==n||j==n)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();

        //Number Pyramid
        //    1
        //   1 2
        //  1 2 3
        // 1 2 3 4
        //1 2 3 4 5
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            //numbers
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Inverted Half Pyramid.
        //1111
        //222
        //33
        //4
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print(i);
            }
            System.out.println();
        }
        System.out.println();
        
        //Pascal's Triangle
        //    1 ye wala 1 print karwane ke lie loop sab (0 to n) hoga not (1 to n)
        //   1 1
        //  1 2 1
        // 1 3 3 1
        //1 4 6 4 1
        for(int i=0;i<=n;i++)
        {
            //spaces
            for(int j=0;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            //numbers
            for(int j=0;j<=i;j++)
            {
                System.out.print(ncr(i,j)+" ");
            }
            System.out.println();
        }
        System.out.println();
        in.close();
    }
    
    //For running pascal triangle
    static int ncr(int n,int r)
    {
        return fact(n)/(fact(n-r)*fact(r));
    }

    static int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
}