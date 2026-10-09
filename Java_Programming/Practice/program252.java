// Accept number from user and turn off its 23th bit

import java.util.*;

class program252
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iMask = 0xFFBFFFFF;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        iNo = iNo & iMask;

        System.out.println("Updated number is : "+iNo);


    }
}