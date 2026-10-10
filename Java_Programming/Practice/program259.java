//Accept number from user and toggle its 21 and 27 bit

import java.util.*;

class program259
{
    public static void main(String A[])
    {
        int iMask = 0x04100000;
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = iNo ^ iMask;

        System.out.println("Updated number is : "+iRet);


    }
}