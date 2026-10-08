// Accept number from user and toggle bit at its 4th position

import java.util.*;

class program242
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iMask = 0x00000008;

        iNo = iNo ^ iMask;

        System.out.println("Updated number is : "+iNo);

    }
}