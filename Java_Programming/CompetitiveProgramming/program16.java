// Find GCD and LCM of two numbers
// ex : 36 24
// GCD : 12
// LCM : 72

import java.util.Scanner;

class program16
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

        int Smaller = Math.min(No1,No2);
        int Greater = Math.max(No1,No2);

        // GCD
        while(No1 % No2 != 0)
        {
            int remainder = No1 % No2;
            No1 = No2;
            No2 = remainder;
        }

        System.out.println("GCD is : "+No2);

        // LCM
        int i = 0;
        for(i = Greater; i <= Smaller*Greater; i = i+Greater)
        {
            if(i % Smaller == 0)
            {
                break;
            }
        }

        System.out.println("LCM is : "+i);
    }
}