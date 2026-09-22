// Accept one decimal number from user and also accept base of any number system in which you want to convert the given number.

// Ex : 1
// Input 
// Number : 259
// Base : 2
// output : 100000011

// Ex : 2
// Input 
// Number : 259
// Base : 8
// output : 403

import java.util.Scanner;

class program63
{
    public static int Convesion(int iNo, int base)
    {
        int Ans = 0;
        int remainder = 0;
        int Pow = 1;        // 10 ^ 0

        while(iNo != 0)
        {
            remainder = iNo % base;
            Ans = Ans + (remainder * Pow);

            iNo = iNo / base;
            Pow = Pow * 10;

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

        System.out.println("Enter base of number system in which you want to convert a number : ");
        base = sobj.nextInt();

        iRet = Convesion(iNo, base);

        System.out.println("Converted number is : "+iRet);


    }
}