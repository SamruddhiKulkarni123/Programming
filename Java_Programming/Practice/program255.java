class program255
{
    public static void main(String A[])
    {
        int iMask = 0xFFFFFFBF;

        System.out.printf("Before : %x\n",iMask);

        iMask = ~iMask;

        System.out.printf("After : %x\n",iMask);

    }
}