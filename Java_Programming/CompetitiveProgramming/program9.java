// print digits of number from left to right

import java.util.Scanner;

class program9
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iDigit = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        String str = Integer.toString(iNo);

        int Arr[] = new int[str.length()];

        for(int i = 0; (i < Arr.length) && (iNo != 0); i++, iNo = iNo / 10)
        {
            iDigit = iNo % 10;
            Arr[i] = iDigit;

        }

        System.out.println("Digits of number are :");

        for(int i = Arr.length-1; i >= 0; i--)
        {
            System.out.println(Arr[i]);
        }

        
    }
}