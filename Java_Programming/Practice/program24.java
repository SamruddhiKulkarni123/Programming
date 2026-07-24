// print "Jay Ganesh" as per user demand

import java.util.Scanner;

class program24
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iCnt = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter value : ");
        iValue = sobj.nextInt();
        
        for(iCnt = 1; iCnt <= iValue; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
        
   
    }
}