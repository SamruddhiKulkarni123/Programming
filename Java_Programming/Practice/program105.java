// Acccording to users need allocate memory to array and Accept elements of array from user
// and display it on screen

import java.util.Scanner;

class ArrayX
{
    public void Display(int Arr[])
    {
        int iCnt = 0;

        System.out.println("Elements of array are : ");

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }

}
class program105
{
    
    public static void main(String A[])
    {
        int iLength = 0;
        int iCnt = 0;
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

        aobj.Display(Brr);

        Brr = null;
        System.gc();
    }
}