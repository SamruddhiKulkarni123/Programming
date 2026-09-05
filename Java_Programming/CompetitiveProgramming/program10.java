// print digits of number from left to right

import java.util.Scanner;

class program10
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iDigit = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        String str = Integer.toString(iNo);

        int divisor = (int)Math.pow(10, str.length()-1);

        while(divisor != 0)
        {
            iDigit = iNo / divisor;

            System.out.println(iDigit);

            iNo = iNo % divisor;

            divisor = divisor / 10;

        }

        
    }
}