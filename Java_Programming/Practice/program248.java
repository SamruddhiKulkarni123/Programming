// Accept number as well as position from user and toggle bit at that position

import java.util.*;

class BitWise
{
    public int Toggle(int iNo, int iPos)
    {   
        int iResult = 0;
        int iMask = 0x1;

        iMask = iMask << (iPos - 1);

        iResult = iNo ^ iMask;

        return iResult;

    }

}
class program248
{

    public static void main(String A[])
    {
        int iValue = 0;
        int iLocation = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        BitWise bobj = new BitWise();

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        System.out.println("Enter position : ");
        iLocation = sobj.nextInt();

        iRet = bobj.Toggle(iValue, iLocation);

        System.out.println("Updated number is : "+iRet);

    }
}