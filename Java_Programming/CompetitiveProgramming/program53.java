// Input : 7
// Output :
/*
    *   *   *   *   *   *   *
        *   *   *   *   *   
            *   *   *
                *  
            *   *   *
        *   *   *   *   *
    *   *   *   *   *   *   *
    
*/
import java.util.Scanner;

class program53
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        int spaces = 0;
        int pattern = n;
        

        for(i = 1; i <= n; i++)
        {   
            for(j = 1; j <= spaces; j++)
            {
                System.out.print("\t");
                
            }

            for(j = 1; j <= pattern; j++)
            {
                System.out.print("*\t");
            }

            System.out.println();

            if(i <= n / 2)
            {
                spaces++;
                pattern = pattern - 2;
            }
            else
            {
                spaces--;
                pattern = pattern + 2;
            }
            
        }

        

        
    }
}