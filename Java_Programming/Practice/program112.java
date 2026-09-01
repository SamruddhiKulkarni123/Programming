// Acccording to users need allocate memory to array and Accept elements of array from user
// and check whether 11 is present or not in array

import java.util.Scanner;

class ArrayX
{
    public boolean LinearSearch(int Arr[])
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == 11)
            {
                return true;
            }
        }

        return false;
    }

}
class program112
{
    
    public static void main(String A[])
    {
        int iLength = 0;
        int iCnt = 0;
        boolean bRet = false;
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

        bRet = aobj.LinearSearch(Brr);

        if(bRet == true)
        {
            System.out.println("Element is present");
        }
        else
        {
            System.out.println("Element is not present");
        }

        Brr = null;
        System.gc();
    }
}