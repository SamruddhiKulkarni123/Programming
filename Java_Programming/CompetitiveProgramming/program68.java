// You are given a base b.
// You are given a two numbers n1 and n2 of base.
// You are required to substract them and print substraction.


import java.util.Scanner;

class program68
{
    public static int Substraction(int b, int n1, int n2)
    {
        int Ans = 0;
        int d1 = 0;
        int d2 = 0;
        int d = 0;
        int borrow = 0;
        int pow = 1;        // base ^ 0

        int temp = 0;
        boolean bFlag = false;

        if(n1 < n2)
        {
            temp = n1;
            n1 = n2;
            n2 = temp;

            bFlag = true;
        }

        while(n1!=0)
        {
            d1 = n1 % 10;
            d2 = n2 % 10;

            d1 = d1 + borrow;
            borrow = 0;

            if(d1 < d2)
            {
                d = d1 + b - d2;
                borrow = -1;
            }
            else
            {
                d = d1 - d2;

            }


            Ans = Ans + (d * pow);
            
            pow = pow * 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

        }

        if(bFlag == true)
        {
            Ans = -Ans;
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

        iRet = Substraction(b,n1,n2);

        System.out.println("Substraction is : "+iRet);


    }
}