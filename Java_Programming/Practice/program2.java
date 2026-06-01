// Program to perforrm addition of two integers

import java.util.Scanner;

class Addition
{

    public static void main(String A[])
    {
        int iValue1 = 0;
        int iValue2 = 0;
        int iRet = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        iValue1 = sc.nextInt();

        System.out.print("Enter second number:");
        iValue2 = sc.nextInt();

        iRet = iValue1 + iValue2 ;

        System.out.println("Addition is:"+iRet);


    }
}

