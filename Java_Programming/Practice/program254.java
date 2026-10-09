class program254
{
    public static void main(String A[])
    {
        int iMask = 0xFFFFFFFF;

        System.out.printf("Before : %x\n",iMask);

        iMask = ~iMask;

        System.out.printf("After : %x\n",iMask);

    }
}