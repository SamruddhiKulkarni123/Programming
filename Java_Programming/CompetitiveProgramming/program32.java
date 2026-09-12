// Input : 5
// Output :
/*
    
            *  
        *       *
    *               *
        *       *
            *  
                
*/
import java.util.Scanner;

class program32
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        int OuterSpace = n/2;
        int InnerSpace = -1;

        for(i = 1; i <= n; i++)
        { 
            for(j = 1; j <= OuterSpace; j++)
            {
                System.out.print("\t");
            }

            System.out.print("*\t");
            
            for(j = 1; j <= InnerSpace; j++)
            {
                System.out.print("\t");
            }

            if(i > 1 && i < n)
            {
                System.out.print("*\t");
            }

            if(i <= n/2)
            {
                OuterSpace--;
                InnerSpace = InnerSpace + 2;
            }
            else
            {
                OuterSpace++;
                InnerSpace = InnerSpace - 2;
            }

            System.out.println();

        }

        
    }
}