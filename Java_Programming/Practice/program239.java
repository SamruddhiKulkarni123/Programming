// For single bit moving right (80000000, 40000000, 20000000, ...), 
// use the unsigned shift >>>, which always 
// fills with 0

//in C, choose the type (signed or unsigned) to control the fill bit. 
// In Java, choose the operator (>> or >>>).


class program239
{
    public static void main(String A[])
    {
        int iMask = 0x80000000;
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 33; iCnt++)          // Overflow
        {
            System.out.printf("%d : %X\n",iCnt, iMask);
            iMask = iMask >>> 1;
        }
    }
}