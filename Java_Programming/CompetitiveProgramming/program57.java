// Input : 5
// Output :
/*
    *               *
    *               *
    *       *       * 
    *   *       *   *
    *               *    
*/
import java.util.Scanner;

class program57
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
            for(j = 1; j <= n; j++)
            {
                if(j == 1 || j == n)
                {
                    System.out.print("*\t");
                }
                else if(i > n/2 && (i+j == n+1 || i == j))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
        
    }
}