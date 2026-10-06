// Accept number as well as position from user and check whether bit of that position is ON or OFF

import java.util.Scanner;

class program231
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iPos = 0;
        int iMask = 0x1;
        int iAns = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter Position : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos - 1);

        iAns = iNo & iMask;

        if(iAns == iMask)
        {
            System.out.println("Bit is ON");
        }
        else
        {
            System.out.println("Bit is OFF");
        }


    }
}