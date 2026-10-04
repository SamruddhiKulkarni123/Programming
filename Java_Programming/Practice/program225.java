// Accept number from user and check whether its seventh bit is ON or OFF

import java.util.Scanner;

class program225
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 64;
        int iAns = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("Seventh bit of number is ON");
        }
        else
        {
            System.out.println("Seventh bit of number is OFF");
        }


    }
}