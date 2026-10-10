//Accept number from user and toggle its 9th and 17th bit

import java.util.*;

class program257
{
    public static void main(String A[])
    {
        int iMask = 0x00010100;
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = iNo ^ iMask;

        System.out.println("Updated number is : "+iRet);


    }
}