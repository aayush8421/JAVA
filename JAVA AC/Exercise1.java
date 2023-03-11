import java.util.*;
public class Exercise1 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);

        //Average
        System.out.println("Enter the 3 nos for average:");
        double a=in.nextDouble();
        double b=in.nextDouble();
        double c=in.nextDouble();
        System.out.println("The average of the three nos is: "+average(a,b,c));
        System.out.println();

        //Sum of odd nos
        System.out.println("Enter the limit for finding the sum of odd till it:");
        int l=in.nextInt();
        System.out.println("The sum of all odd nos till n is: "+sumOfOdd(l));
        System.out.println();

        //Greater
        System.out.println("Enter the two nos:");
        double x=in.nextDouble();
        double y=in.nextDouble();
        System.out.println("The greater no between the two is: "+greater(x,y));
        System.out.println();

        //Circumference of circle
        System.out.println("Enter the radius of the circle:");
        double r=in.nextDouble();
        System.out.println("The circumference of the circle is: "+circumference(r));
        System.out.println();

        //Vote eligible
        System.out.println("Enter the age of the person:");
        int age=in.nextInt();
        if(voteEligible(age)==1)
        System.out.println("Person is eligible for voting");
        else
        System.out.println("The person is not eligible for voting");
        System.out.println();

        //No of 0,+ve,-ve numbers
        int q=1;
        int zero=0;
        int positive=0;
        int negative=0;
        while(q==1)
        {
            System.out.println("Enter the number:");
            int num=in.nextInt();
            if(num==0)
            zero++;
            else if(num>0)
            positive++;
            else
            negative++;
            System.out.println("Do you want to continue");
            System.out.println("Enter 1 for YES and 0 for NO");
            q=in.nextInt();
        }
        System.out.println("The no of positive nos are: "+positive);
        System.out.println("The no of negative nos are: "+negative);
        System.out.println("The no of zeros are: "+zero);
        System.out.println();

        //exponent
        System.out.println("Enter the base");
        int base=in.nextInt();
        System.out.println("Enter the power");
        int power=in.nextInt();
        System.out.println(base+" ^ "+power+" = "+exponent(base,power));
        System.out.println();

        //GCD
        System.out.println("Enter the two nos for calculating gcd");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int pro=num1*num2;
        int gcd=0;
        for(int i=1;i<pro;i++)
        {
            if(num1%i==0&&num2%i==0)
            gcd=i;
        }
        System.out.println("The GCD of the entered numbers is: "+gcd);
        System.out.println();

        //fibonacci
        System.out.println("Enter the limit of fibonacci");
        int n=in.nextInt();
        int a1=0;
        int b1=1;
        int c1=0;
        System.out.println("The fibonacci series is: ");
        System.out.print(a1+" "+b1+" ");
        for(int i=3;i<=n;i++)
        {
            c1=a1+b1;
            System.out.print(c1+" ");
            a1=b1;
            b1=c1;
        }
        System.out.println();

        in.close();
    }

    //Average wala function
    public static double average(double a,double b,double c) 
    {
        return ((a+b+c)/3);
    }

    //Sum of odd wala function
    public static int sumOfOdd(int l) 
    {
        int s=0;
        for(int i=1;i<=l;i++)
        {
            if(i%2!=0)
            s=s+i;
        }
        return s;
    }

    //Greater wala function
    public static double greater(double x,double y) 
    {
        if(x>y)
        return x;
        else
        return y;
        
    }

    //Circumference wala function
    public static double circumference(double r) 
    {
        return (2*3.14*r);
    }

    //Vote eligible wala function
    public static int voteEligible(int age) 
    {
        if(age>18)
        return 1;
        else
        return 0;        
    }

    //exponent
    public static double exponent(int base,int power) 
    {
        return Math.pow(base, power);
    }

}