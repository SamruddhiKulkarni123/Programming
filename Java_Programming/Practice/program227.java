// Accept number from user and check whether its 17th bit is ON or OFF

import java.util.Scanner;

class program227
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 0x00010000;
        int iAns = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("17 th bit of number is ON");
        }
        else
        {
            System.out.println("17 th bit of number is OFF");
        }


    }
}