// Accept number as well as position from user and toggle bit at that position

import java.util.*;

class program245
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iPos = 0;
        int iMask = 0x1;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        System.out.println("Enter position : ");
        iPos = sobj.nextInt();

        iMask = iMask << (iPos - 1);

        iNo = iNo ^ iMask;

        System.out.println("Updated number is : "+iNo);

    }
}