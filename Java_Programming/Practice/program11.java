// Check whether number is even or odd

import java.util.Scanner;

class program11
{
    public static boolean CheckEvenOdd(int iNo)
    {
        if(iNo % 2 == 0)
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

        if(bRet)
        {
            System.out.println("Number is Even");
        }

        else
        {
            System.out.println("Number is Odd");
        }

    }

}