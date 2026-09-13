// Input : 4
// Output :
/*
    
                1
            2   1
        3   2   1
    4   3   2   1
*/
import java.util.Scanner;

class program47
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        int spaces = n - 1;
        int value = 1;


        for(i = 1; i <= n; i++)
        {   
            for(j = 1; j <= spaces; j++)
            {
                System.out.print("\t");
            }

            int cValue = i;

            for(j = 1; j <= value; j++)
            {
                System.out.print(cValue+"\t");
                cValue--;
            }

            System.out.println();
            spaces--;
            value++;
            
        }

        

        
    }
}