// Find GCD and LCM of two numbers
// ex : 36 24
// GCD : 12
// LCM : 72

import java.util.Scanner;

class program17
{
    public static void main(String A[])
    {
        int No1 = 0;
        int No2 = 0;
        

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        No1 = sobj.nextInt();

        System.out.println("Enter second number : ");
        No2 = sobj.nextInt();

        int temp1 = No1;
        int temp2 = No2;

        // GCD
        while(No1 % No2 != 0)
        {
            int remainder = No1 % No2;
            No1 = No2;
            No2 = remainder;
        }

        System.out.println("GCD is : "+No2);

        int lcm = (temp1 * temp2) / No2;

        System.out.println("LCM is : "+lcm);
    }
}