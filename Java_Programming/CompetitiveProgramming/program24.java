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

class program24
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        int space = n-1;
        int star = 1;

        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= space; j++)
            {
                System.out.print("\t");
            }
            for(j = 1; j <= star; j++)
            {
                System.out.print("*\t");
            }
            System.out.println();

            space--;
            star++;
        }

        
    }
}