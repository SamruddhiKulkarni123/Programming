// Accept one number in any number system from user with their base and 
// also accept base of number system in which you want to convert the given number.

// Ex : 1
// Input 
// Number : 512
// b1 : 8
// b2 : 2
// output : 101001010

import java.util.Scanner;

class program65
{
    public static int AnyBaseToDecimal(int iNo, int b1)
    {
        int Ans = 0;
        int iDigit = 0;
        int Pow = 1;        // base ^ 0

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            Ans = Ans + (iDigit * Pow);

            iNo = iNo / 10;
            Pow = Pow * b1;

        }

        return Ans;
    }

    public static int DecimalToAnyBase(int iNo, int b2)
    {
        int Ans = 0;
        int remainder = 0;
        int Pow = 1;        // 10 ^ 0

        while(iNo != 0)
        {
            remainder = iNo % b2;
            Ans = Ans + (remainder * Pow);

            iNo = iNo / b2;
            Pow = Pow * 10;

        }

        return Ans;
    } 

    public static void main(String A[])
    {
        int iNo = 0;
        int b1 = 0;
        int b2 = 0;
        int Dec = 0;
        int Dest = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter base of number : ");
        b1 = sobj.nextInt();

        System.out.println("Enter base of number system in which you want to convert number :: ");
        b2 = sobj.nextInt();

        Dec = AnyBaseToDecimal(iNo, b1);
        Dest = DecimalToAnyBase(Dec , b2);

        System.out.println("converted number is : "+Dest);


    }
}