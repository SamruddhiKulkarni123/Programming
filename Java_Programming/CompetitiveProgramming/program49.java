// Input : 4
// Output :
/*
    
    1                       1
    1   1               1   1
    1   1   1       1   1   1
    1   1   1   1   1   1   1
*/
import java.util.Scanner;

class program49
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        int spaces = (2 * n) - 3;
        int pattern = 1;


        for(i = 1; i <= n; i++)
        {   
            for(j = 1; j <= pattern; j++)
            {
                System.out.print("1\t");
            }

            for(j = 1; j <= spaces; j++)
            {
                System.out.print("\t");
            }

            if(i == n)
            {
                pattern--;
            }

            for(j = 1; j <= pattern; j++)
            {
                System.out.print("1\t");
            }

            System.out.println();

            spaces = spaces - 2;
            pattern++;
            
        }

        

        
    }
}