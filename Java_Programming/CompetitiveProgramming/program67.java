// You are given a base b.
// You are given a two numbers n1 and n2 of base.
// You are required to add them and print addition.


import java.util.Scanner;

class program67
{
    public static int Addition(int b, int n1, int n2)
    {
        int Ans = 0;
        int d1 = 0;
        int d2 = 0;
        int d = 0;
        int c = 0;
        int pow = 1;        // base ^ 0

        while(n1>0 || n2>0 || c>0)
        {
            d1 = n1 % 10;
            d2 = n2 % 10;

            d = d1 + d2 + c; 

            c = d / b;
            d = d % b;

            Ans = Ans + (d * pow);
            
            pow = pow * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

        }

        return Ans;
    }

    public static void main(String A[])
    {
        int b = 0;
        int n1 = 0;
        int n2 = 0;
        int iRet = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter base : ");
        b = sobj.nextInt();

        System.out.println("Enter first number : ");
        n1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        n2 = sobj.nextInt();

        iRet = Addition(b,n1,n2);

        System.out.println("Addition is : "+iRet);


    }
}