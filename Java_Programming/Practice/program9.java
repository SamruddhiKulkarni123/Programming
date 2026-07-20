// Check whether number is even or odd

import java.util.Scanner;

class program9
{
    public static boolean CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;

        iRemainder = iNo % 2;

        if(iRemainder == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        bRet = CheckEvenOdd(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Even");
        }

        else
        {
            System.out.println("Number is Odd");
        }

    }

}