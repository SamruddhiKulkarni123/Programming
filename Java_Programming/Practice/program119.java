// Acccording to users need allocate memory to array and Accept elements of array from user
// and find maximum number

import java.util.Scanner;

class ArrayX
{
    public int Maximum(int Arr[])
    {
        int iCnt = 0;
        int iMax = 0;

        iMax = Arr[0];

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] > iMax)
            {
                iMax = Arr[iCnt];
            }
        }

        return iMax;

    }

}
class program119
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

        iRet = aobj.Maximum(Brr);

        
        System.out.println("Maximum Element is : "+iRet);

        Brr = null;
        System.gc();
    }
}