// Accept number from user and toggle bit at its 11th position

import java.util.*;

class program243
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iMask = 0x400;

        iNo = iNo ^ iMask;

        System.out.println("Updated number is : "+iNo);

    }
}