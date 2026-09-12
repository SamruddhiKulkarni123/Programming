// Input : 6
// Output :
/*
    
    1
    1   1
    1   2   1
    1   3   3   1
    1   4   6   4   1
    1   5   10  10  5   1
                
*/
import java.util.Scanner;

class program35
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        int icj = 0;
        int next = 0;

        for(i = 0; i < n; i++)
        { 
            icj  = 1;

            for(j = 0; j <= i; j++)
            {
                System.out.print(icj+"\t");

                next = (icj * (i - j)) / (j + 1);

                icj = next;
            }

            System.out.println();

        }

        
    }
}