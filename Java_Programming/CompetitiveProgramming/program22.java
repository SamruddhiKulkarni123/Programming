// Input : 5
// Output :
/*
    *
    * *
    * * *
    * * * *
    * * * * *
*/
import java.util.Scanner;

class program22
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= i; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        
    }
}