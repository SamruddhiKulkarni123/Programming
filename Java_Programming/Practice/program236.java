// print 1 to 33 bits with its appropriate mask in hexadecimal

class program236
{
    public static void main(String A[])
    {
        int iCnt = 0;
        int iMask = 1;

        for(iCnt = 1; iCnt <= 33; iCnt++)
        {
            System.out.printf("%d : %x\n",iCnt, iMask);
            iMask = iMask << 1;
        }
    }
}