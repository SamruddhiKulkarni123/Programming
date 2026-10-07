// >> in Java is a signed shift. It copies the sign bit into the vacated position 
// on the left. Since 0x80000000 is negative (sign bit = 1), every shift brings
//  in another 1, so you get 1, 11, 111, ... until all 32 bits are set (FFFFFFFF).

class program237
{
    public static void main(String A[])
    {
        int iMask = 0x80000000;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 32; iCnt++)
        {
            System.out.printf("%d : %X\n",iCnt, iMask);
            iMask = iMask >> 1;
        }
    }
}