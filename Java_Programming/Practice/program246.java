// Accept number as well as position from user and toggle bit at that position

import java.util.*;

class program246
{
    public static int Toggle(int iNo, int iPos)
    {   
        int iResult = 0;
        int iMask = 0x1;

        iMask = iMask << (iPos - 1);

        iResult = iNo ^ iMask;

        return iResult;

    }

    public static void main(String A[])
    {
        int iValue = 0;
        int iLocation = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter position : ");
        iLocation = sobj.nextInt();

        iRet = Toggle(iValue, iLocation);

        System.out.println("Updated number is : "+iRet);

    }
}