// Accept one number in any number system from user with their base and 
// convert it into decimal the given number.

// Ex : 1
// Input 
// Number : 1172
// Base : 8
// output : 634

// Ex : 2
// Input 
// Number : 1010
// Base : 2
// output : 10

import java.util.Scanner;

class program64
{
    public static int Convesion(int iNo, int base)
    {
        int Ans = 0;
        int iDigit = 0;
        int Pow = 1;        // base ^ 0

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            Ans = Ans + (iDigit * Pow);

            iNo = iNo / 10;
            Pow = Pow * base;

        }

        return Ans;
    }

    public static void main(String A[])
    {
        int iNo = 0;
        int base = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter base of number : ");
        base = sobj.nextInt();

        iRet = Convesion(iNo, base);

        System.out.println("Equivalent decimal number is : "+iRet);


    }
}