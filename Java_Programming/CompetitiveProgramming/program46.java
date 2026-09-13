// Input : 4
// Output :
/*
    
    1
    1   2
    1   2   3
    1   2   3   4

*/
import java.util.Scanner;

class program46
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
            for(j = 1; j <= i; j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
            
        }

        

        
    }
}