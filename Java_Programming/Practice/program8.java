// Check whether number is even or odd

import java.util.Scanner;

class program8
{
    public static int CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;

        iRemainder = iNo % 2;

        return iRemainder;

    }

    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        iRet = CheckEvenOdd(iValue);

        if(iRet == 0)
        {
            System.out.println("Number is Even");
        }

        else
        {
            System.out.println("Number is Odd");
        }

    }

}