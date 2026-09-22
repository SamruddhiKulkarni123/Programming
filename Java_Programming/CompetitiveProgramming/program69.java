// You are given a base b.
// You are given a one number n and digit d of base.
// You are required to perform multiplication of digit with numner.


import java.util.Scanner;

class program69
{
    public static int Multiplication(int b, int n, int d)
    {
        int Ans = 0;
        int mult = 0;
        int idigit = 0;
        int c = 0;
        int pow = 1;        // base ^ 0

        while(n != 0 || c != 0)
        {
            idigit = n % 10;
 
            mult = (idigit * d) + c;

            c = mult / b;

            mult = mult % b;

            Ans = Ans + (mult * pow);
            
            pow = pow * 10;
            n = n / 10;
        

        }

        return Ans;
    }

    public static void main(String A[])
    {
        int b = 0;
        int n = 0;
        int d = 0;
        int iRet = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter base : ");
        b = sobj.nextInt();

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        System.out.println("Enter digit : ");
        d = sobj.nextInt();

        iRet = Multiplication(b,n,d);

        System.out.println("Multiplication is : "+iRet);


    }
}