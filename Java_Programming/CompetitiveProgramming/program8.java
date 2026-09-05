// Count digits of a number

import java.util.Scanner;

class program8
{
    public static void main(String A[])
    {
        int N = 0;
        int d = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Number : ");
        N = sobj.nextInt();

        while(N != 0)
        {
            d++;
            N = N / 10;
            
        }

        System.out.println("Number of digits are : "+d);

        
    }
}