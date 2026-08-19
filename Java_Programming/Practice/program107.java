// Acccording to users need allocate memory to array and Accept elements of array from user
// and count even elements from array

import java.util.Scanner;

class ArrayX
{
    public int CountEven(int Arr[])
    {
        int iCnt = 0;
        int iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }

        return iCount;
    }

}
class program107
{
    
    public static void main(String A[])
    {
        int iLength = 0;
        int iCnt = 0;
        int iRet = 0;
        int Brr[] = null;

        Scanner sobj = new Scanner(System.in);
        ArrayX aobj = new ArrayX();

        System.out.println("Enter number of elements : ");
        iLength = sobj.nextInt();

        Brr = new int[iLength];

        System.out.println("Enter elements : ");

        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        iRet = aobj.CountEven(Brr);

        System.out.println("Even Elements are : "+iRet);

        Brr = null;
        System.gc();
    }
}