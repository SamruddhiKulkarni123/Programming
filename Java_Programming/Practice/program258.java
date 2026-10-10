//Accept number from user and toggle its 12 and 23 bit

import java.util.*;

class program258
{
    public static void main(String A[])
    {
        int iMask = 0x00400800;
        int iNo = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iRet = iNo ^ iMask;

        System.out.println("Updated number is : "+iRet);


    }
}