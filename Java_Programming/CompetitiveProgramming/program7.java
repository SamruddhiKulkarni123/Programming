// First n fibonacci numberes

import java.util.Scanner;

class program7
{
    public static void main(String A[])
    {
        int iNo = 0;
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter how many fibonacci number you want to print : ");
        iNo = sobj.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println("First " +iNo +" fibonacci numbers are : ");

        for(i = 0; i < iNo; i++)
        {
            System.out.println(a);

            c = a + b;

            a = b;
            b = c;
        }

        
    }
}