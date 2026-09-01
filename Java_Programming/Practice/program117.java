// Acccording to users need allocate memory to array and Accept elements of array from user
// and also accept one number from user check whether that number is present or not in array

import java.util.Scanner;

class ArrayX
{
    public boolean LinearSearch(int Arr[], int iNo)
    {
        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                break;
            }
        }

       if(iCnt == Arr.length)
       {
            return false;
       }
       else
       {
            return true;
       }

    }

}
class program117
{
    
    public static void main(String A[])
    {
        int iValue = 0;
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

        System.out.println("Enter number to search in array : ");
        iValue = sobj.nextInt();


        bRet = aobj.LinearSearch(Brr,iValue);

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