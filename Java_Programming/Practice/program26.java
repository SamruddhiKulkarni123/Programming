// print "Jay Ganesh" as per user demand

import java.util.Scanner;

class Iteration
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }

}
class program26
{

    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        Iteration iobj = new Iteration();

        System.out.println("Enter value : ");
        iValue = sobj.nextInt();
        
        iobj.Display(iValue);
        
   
    }
}