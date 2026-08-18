// Print elements of array on screen

class program97
{
    public static void Display(int Brr[])
    {
        int iCnt = 0;

        for(iCnt =  0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

    }
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40,50};

        Display(Arr);
    }
}