// Input : 4
// Output :
/*
    
    0
    1   1
    2   3   5
    8   13  21  34
                
*/
import java.util.Scanner;

class program34
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int j = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        for(i = 1; i <= n; i++)
        { 
            for(j = 1; j <= i; j++)
            {
                System.out.print(a+"\t");

                c = a + b;
                a = b;
                b = c;

            }

            System.out.println();

        }

        
    }
}