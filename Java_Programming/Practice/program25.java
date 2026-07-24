// print "Jay Ganesh" as per user demand

import java.util.Scanner;

class program25
{
    public static void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }

    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter value : ");
        iValue = sobj.nextInt();
        
        Display(iValue);
        
   
    }
}