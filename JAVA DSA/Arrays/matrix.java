//TRANSPOSE OF A MATRIX
//ROTATE A MATRIX BY 90 DEGREE
//SERACH AN ELEMENT IN A ROW WISE AND COLUMN WISE SORTED MATRIX

public class matrix 
{
    //SERACH AN ELEMENT IN A ROW WISE AND COLUMN WISE SORTED MATRIX
    public static boolean searchAnElementInSortedMatrix(int a[][],int key)
    {
        int row=0;
        int col=a.length-1;
        while(row<a.length && col>=0)
        {
            if(a[row][col]==key) return true;
            else if(a[row][col]<key) row++;
            else col--;
        }
        return false;
    }

    //ROTATE MATRIX BY 90 DEGREE
    public static void rotateMatrix(int a[][])
    {
        int n=a.length;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<(a.length/2);j++)
            {
                int t=a[i][j];
                a[i][j]=a[i][n-j-1];
                a[i][n-j-1]=t;
            }
        }
    }

    //PRINT THE MATRIX
    public static void printMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }

    //FIND THE TRANSPOSE OF THE MATRIX
    public static void transposeOfMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i;j<a.length;j++)
            {
                int t=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=t;
            }
        }
    }

    public static void main(String[] args) 
    {
        int a[][]={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        // System.out.println("Original Matrix");
        // printMatrix(a);
        // transposeOfMatrix(a);
        // rotateMatrix(a);
        // System.out.println("Transpose of a Matrix");
        // System.out.println("Matrix rotated by 90 degree");
        // printMatrix(a);
        
        int key=7;
        System.out.println(searchAnElementInSortedMatrix(a, key));
    }   
}
