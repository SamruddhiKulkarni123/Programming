// print reverse of a given number

import java.util.Scanner;

class program11
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iDigit = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iDigit = iNo % 10;

            System.out.print(iDigit);

            iNo = iNo / 10;

        }

        
    }
}