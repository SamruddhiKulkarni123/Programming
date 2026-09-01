// Acccording to users need allocate memory to array and Accept elements of array from user
// and find maximum number

import java.util.Scanner;

class ArrayX
{
    public int Minimum(int Arr[])
    {
        int iCnt = 0;
        int iMin = 0;

        iMin = Arr[0];

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] < iMin)
            {
                iMin = Arr[iCnt];
            }
        }

        return iMin;

    }

}
class program120
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

        iRet = aobj.Minimum(Brr);

        
        System.out.println("Minimum Element is : "+iRet);

        Brr = null;
        System.gc();
    }
}