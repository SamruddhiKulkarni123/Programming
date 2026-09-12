// Input : 5
// Output :
/*
    
            1
        1   1   1
    1   1   1   1   1
        1   1   1
            1

*/
import java.util.Scanner;

class program39
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
        int value = 1;


        for(i = 1; i <= n; i++)
        {
            for(j = 1; j <= spaces; j++)
            {
                System.out.print("\t");
            }
            for(j = 1; j <= pattern; j++)
            {
                System.out.print(value+"\t");
            }

            if(i <= n/2)
            {
                spaces--;
                pattern = pattern + 2;
            }
            else
            {
                spaces++;
                pattern = pattern - 2;
            }
            
            System.out.println();
            
        }

        
    }
}