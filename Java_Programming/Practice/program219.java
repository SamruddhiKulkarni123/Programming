// Convert given decimal number into its corresponding binary number

import java.util.*;

class program219
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iDigit = 0;
        int Arr[] = new int[32];
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 2;
            Arr[i] = iDigit;

            i++;
            iNo = iNo / 2;
        }

        for(j = Arr.length - 1; j >= 0; j--)
        {
            System.out.print(Arr[j]);
        }

    }
}