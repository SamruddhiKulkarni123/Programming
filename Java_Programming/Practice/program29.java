// print "Jay Ganesh" as per user demand

import java.util.Scanner;

class Iteration
{
    public int iNo;

    public Iteration(int A)
    {
        this.iNo = A;
    }

    public void Display()
    {
        
        int iCnt = 0;

        // filter
        if(iNo < 0)
        {
            System.out.println("Invalid input");
            return;
        }

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("Jay Ganesh...");
        }
    }

}
class program29
{

    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter value : ");
        iValue = sobj.nextInt();

        Iteration iobj = new Iteration(iValue);
        
        iobj.Display();
        
   
    }
}