// Check whether number is even or odd

import java.util.Scanner;

class program7
{
    public static void CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;

        iRemainder = iNo % 2;

        if(iRemainder == 0)
        {
            System.out.println("Number is Even");
        }

        else
        {
            System.out.println("Number is Odd");
        }

    }

    public static void main(String A[])
    {
        int iValue = 0;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        CheckEvenOdd(iValue);

    }

}