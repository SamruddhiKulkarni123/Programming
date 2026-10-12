//Accept number as well as two positions from user and toggle bits at that position 

import java.util.*;

class program263
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iPos1 = 0;
        int iPos2 = 0;
        int iRet = 0;

        int iMask1 = 0x1;
        int iMask2 = 0x1;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter first position : ");
        iPos1 = sobj.nextInt();

        System.out.println("Enter second position : ");
        iPos2 = sobj.nextInt();

        iMask1 = iMask1 << (iPos1 - 1);
        iMask2 = iMask2 << (iPos2 - 1);
        
        int iMask = iMask1 | iMask2;

        iRet = iNo ^ iMask;

        System.out.println("Updated number is : "+iRet);


    }
}