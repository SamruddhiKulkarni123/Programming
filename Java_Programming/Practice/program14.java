// Calculation of ticket price on the basis of age

import java.util.Scanner;

class program14
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter age : ");
        iValue = sobj.nextInt();

        if((iValue >= 0) && (iValue <= 5))
        {
            System.out.println("Your ticket price is 0");
        }
        else if((iValue >= 6) && (iValue <= 18))
        {
            System.out.println("Your ticket price is 500");
        }
        else if((iValue >= 19) && (iValue <= 50))
        {
            System.out.println("Your ticket price is 900");
        }
        else
        {
            System.out.println("Your ticket price is 400");
        }
        
    }
}