// Accept the elements of array from user and return summation of elements

import java.util.*;

class ArrayX
{
    public int Summation(int Arr[])
    {
        int iSum = 0, iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;
    }

}
class program91
{

    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        ArrayX aobj = new ArrayX();

        int iCnt = 0;

        System.out.println("Enter the number of elements : ");
        int iLength = sobj.nextInt();

        // Brr = (int *)malloc(sizeof(int) * iLength);
        int Brr[] = new int[iLength];
        
        System.out.println("Enter the elements : ");
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }

        int iRet = aobj.Summation(Brr);

        System.out.println("Sumation is : "+iRet);
        
        Brr = null;
        System.gc();
    }
}