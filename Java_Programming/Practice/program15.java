// Calculation of ticket price on the basis of age

import java.util.Scanner;

class program15
{
    public static int CalculateTicketPrice(int iAge)
    {
        if((iAge >= 0) && (iAge <= 5))
        {
            return 0;
        }
        else if((iAge >= 6) && (iAge <= 18))
        {
            return 500;
        }
        else if((iAge >= 19) && (iAge <= 50))
        {
            return 900;
        }
        else
        {
            return 400;
        }

    }

    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter age : ");
        iValue = sobj.nextInt();

        iRet = CalculateTicketPrice(iValue);

        System.out.println("Your ticket price is : "+ iRet);
        
    }
}