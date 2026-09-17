// Input : 5
// Output :
/*
    
            *       
            *   *
    *   *   *   *   *
            *   *
            *   
*/
import java.util.Scanner;

class program52
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        int spaces = n / 2;
        int pattern = 1;
        

        for(i = 1; i <= n; i++)
        {   
            for(j = 1; j <= spaces; j++)
            {
                if(i == (n / 2)+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }

            for(j = 1; j <= pattern; j++)
            {
                System.out.print("*\t");
            }

            System.out.println();

            if(i <= n / 2)
            {
                pattern++;
            }
            else
            {
                pattern--;
            }
            
        }

        

        
    }
}