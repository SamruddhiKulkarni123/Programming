// print 1 to 32 bits with its appropriate mask in hexadecimal

class program235
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iMask = 1;

        for(iCnt = 1; iCnt <= 32; iCnt++)
        {
            System.out.printf("%d : %x\n",iCnt, iMask);
            iMask = iMask << 1;
        }
    }
}