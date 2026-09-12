// Input : 4
// Output :
/*
    
    4 * 1 = 4
    4 * 2 = 8
    4 * 3 = 12
    . . .
    . . .
    . . .
    4 * 10 = 40;

*/
import java.util.Scanner;

class program36
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();


        for(i = 1; i <= 10; i++)
        { 
            System.out.println(n+ " * "+i+" = "+n*i);
        }

        
    }
}