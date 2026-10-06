// print 1 to 1000 numbers in decimal with its hexadecimal equivalent number

class program233
{
    public static void main(String A[])
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= 1000; iCnt++)
        {
            System.out.printf("%d\t%X\n",iCnt, iCnt);
        }
    }
}