// print 1 to 100 numbers in decimal with its hexadecimal equivalent number

class program232
{
    public static void main(String A[])
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 100; iCnt++)
        {
            System.out.printf("%d\t%X\n",iCnt, iCnt);
        }
    }
}