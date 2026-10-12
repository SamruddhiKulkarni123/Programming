//Accept number from user and toggle its 3 and 8 bit

import java.util.*;

class program262
{
    public static void main(String A[])
    {
        int iMask1 = 0x1;
        int iMask2 = 0x1;
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iMask1 = iMask1 << 2;
        iMask2 = iMask2 << 7;
        
        int iMask = iMask1 | iMask2;

        iRet = iNo ^ iMask;

        System.out.println("Updated number is : "+iRet);


    }
}