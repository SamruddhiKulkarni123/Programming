// Input : 5
// Output :
/*
    
    1
    2   3
    4   5   6
    7   8   9   10
    11  12  13  14  15
                
*/
import java.util.Scanner;

class program33
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;
        int iValue = 1;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();


        for(i = 1; i <= n; i++)
        { 
            for(j = 1; j <= i; j++,iValue++)
            {
                System.out.print(iValue+"\t");
            }

            System.out.println();

        }

        
    }
}