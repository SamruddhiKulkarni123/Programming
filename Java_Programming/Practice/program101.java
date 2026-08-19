// Accept elements of array from user and return sum of elements

import java.util.Scanner;

class ArrayX
{
    public int Summation(int Arr[])
    {
        int iCnt = 0;
        int iSum = 0;
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }

        return iSum;

    }

}
class program101
{
    
    public static void main(String A[])
    {
        int iLength = 4;
        int iCnt = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        ArrayX aobj = new ArrayX();

        int Brr[] = new int[iLength];

        System.out.println("Enter elements :");
        
        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt(); 
        }

        iRet = aobj.Summation(Brr);
        
        System.out.println("Addition of all elemennts of array is : "+iRet);

    }
}