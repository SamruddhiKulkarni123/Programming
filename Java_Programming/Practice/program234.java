// print 1 to 32 bits with its appropriate mask in decimal

class program234
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iMask = 1;

        for(iCnt = 1; iCnt < 32; iCnt++)
        {
            System.out.printf("%d : %d\n",iCnt, iMask);
            iMask = iMask << 1;
        }
    }
}