import java.util.*;
public class Patterns2 
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the Limit");
        int n=in.nextInt();

        //Butterfly Pattern (n=4)
        //                1st half       No.of Spaces       2nd half
        //*      *  i=1->  1stars     6spaces(2*4-2*1=6)     1stars
        //**    **  i=2->  2stars     4spaces(2*4-2*2=4)     2stars
        //***  ***  i=3->  3stars     2spaces(2*4-2*3=2)     3stars
        //********  i=4->  4stars     0spaces(2*4-2*4=0)     4stars
        //******** 
        //***  ***  //Lower half->Inverse of upper half
        //**    ** 
        //*      *
        //Stars(1st half,2nd half)->Equal to no of rows(i)
        //Spaces->2*(n-i)

        //upper half
        for(int i=1;i<=n;i++)
        {
            //1st part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for(int i=n;i>=1;i--)
        {
            //1st part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }

            //spaces
            int space=2*(n-i);
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }

            //2nd part
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Rhombus Pattern (n=5)
        //i=1->4spaces 5stars
        //i=2->3spaces 5stars
        //i=3->2spaces 5stars
        //i=4->1spaces 5stars
        //i=5->0spaces 5stars
        //    *****
        //   *****
        //  *****
        // *****
        //*****
        //spaces->n-i

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
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        //Number Pyramid (n=5)
        //    1      i=1->4spaces 1(1x)
        //   2 2     i=2->3spaces 2(2x)
        //  3 3 3    i=3->2spaces 3(3x)
        // 4 4 4 4   i=4->1spaces 4(4x)
        //5 5 5 5 5  i=5->0spaces 5(5x)
        //spaces->(n-i)

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
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Pallindromic Pattern (n=5)
        //                 Spaces      1st Half     2nd Half
        //    1      i=1-> 4spaces      1            X
        //   212     i=2-> 3spaces      2 to 1       2
        //  32123    i=3-> 2spaces      3 to 1       2 to 3
        // 4321234   i=4-> 1spaces      4 to 1       2 to 4
        //543212345  i=5-> 0spaces      5 to 1       2 to 5
        //spaces->(n-i)

        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            //1st half numbers
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }

            //2nd half numbers
            for(int j=2;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();

        //Diamond Pattern (n=4)
        //               Spaces          No. of Stars
        //   *     i=1-> 3spaces        1stars(2*1-1=1)
        //  ***    i=2-> 2spaces        3stars(2*2-1=3)
        // *****   i=3-> 1spaces        5stars(2*3-1=5)
        //*******  i=4-> 0spaces        7stars(2*4-1=7)
        //*******
        // *****   lower half->Inverse of upper half
        //  ***
        //   *
        //Spaces->(n-i)
        //Stars->(2*i-1)

        //upper half
        for(int i=1;i<=n;i++)
        {
            //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            //Stars
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //Lower half
        for(int i=n;i>=1;i--)
        {
            //spaces
            for(int j=1;j<=(n-i);j++)
            {
                System.out.print(" ");
            }

            //Stars
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        in.close();
    }
}
