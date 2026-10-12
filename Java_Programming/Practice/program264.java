//Accept number as well as two positions from user and toggle bits at that position 

import java.util.*;

class program264
{
    public static int ToggleBits(int iNo, int iPos1, int iPos2)
    {
        int Result = 0;

        int iMask1 = 0x1;
        int iMask2 = 0x1;

        iMask1 = iMask1 << (iPos1 - 1);
        iMask2 = iMask2 << (iPos2 - 1);

        int iMask = iMask1 | iMask2;

        Result = iNo ^ iMask;

        return Result;

    }
    public static void main(String A[])
    {
        int iValue = 0;
        int iLocation1 = 0;
        int iLocation2 = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter first position : ");
        iLocation1 = sobj.nextInt();

        System.out.println("Enter second position : ");
        iLocation2 = sobj.nextInt();

        
        iRet = ToggleBits(iValue, iLocation1, iLocation2);
        

        System.out.println("Updated number is : "+iRet);


    }
}