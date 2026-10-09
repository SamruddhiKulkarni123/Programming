// Accept number as well as position from user and turn off bit of that position

import java.util.*;

class BitWise
{
    public int OffBit(int iNo, int iPos)
    {   
        int iResult = 0;
        int iMask = 0x1;

        iMask = iMask << (iPos - 1);

        iMask = ~iMask;

        iResult = iNo & iMask;

        return iResult;

    }

}
class program253
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

        iRet = bobj.OffBit(iValue, iLocation);

        System.out.println("Updated number is : "+iRet);

    }
}