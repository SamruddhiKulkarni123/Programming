// Acccording to users need allocate memory to array and Accept elements of array from user

import java.util.Scanner;

class program102
{
    public static void main(String A[])
    {
        int iLength = 0;
        int iCnt = 0;
        int Brr[] = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        iLength = sobj.nextInt();

        Brr = new int[iLength];

        System.out.println("Enter elements : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        Brr = null;
        System.gc();
    }
}