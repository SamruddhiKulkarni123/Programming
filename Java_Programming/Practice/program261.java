//Accept number from user and toggle its 3 and 8 bit

import java.util.*;

class program261
{
    public static void main(String A[])
    {
        int iMask1 = 0x00000004;
        int iMask2 = 0x00000080;
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        int iMask = iMask1 | iMask2;

        iRet = iNo ^ iMask;

        System.out.println("Updated number is : "+iRet);


    }
}