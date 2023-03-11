import java.util.*;
public class TwoDarray
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the no of rows");
        int r=in.nextInt();
        System.out.println("Enter the no of columns");
        int c=in.nextInt();
        int matrix[][]=new int[r][c];
        System.out.println("Enter the elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                matrix[i][j]=in.nextInt();
            }
        }

        //Transpose of a matrix
        // System.out.println("the transpose of a matrix :");
        // for(int i=0;i<r;i++)
        // {
        //     for(int j=0;j<c;j++)
        //     {
        //         System.out.print(matrix[j][i]+" ");
        //     }
        //     System.out.println();
        // }

        //Spiral order of matrix
        int rs=0;
        int re=r;
        int ce=c;
        for(int i=0;i<ce;i++)
        {
            System.out.print(matrix[rs][i]+" ");
        }
        rs++;
        for(int i=rs;i<re;i++)
        {
            System.out.print(matrix[i][ce]+" ");
        }
        in.close();
    }
}
