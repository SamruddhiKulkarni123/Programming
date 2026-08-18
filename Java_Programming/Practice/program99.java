// Accept elements of array from user and display it on screen

import java.util.Scanner;

class ArrayX
{
    public static void Display(int Arr[])
    {
        int iCnt = 0;

        System.out.println("Elements of array are :");
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }

}
class program99
{
    
    public static void main(String A[])
    {
        int iLength = 4;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        int Brr[] = new int[iLength];

        System.out.println("Enter elements :");
        
        for(iCnt = 0; iCnt < iLength; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt(); 
        }

        ArrayX.Display(Brr);

    }
}