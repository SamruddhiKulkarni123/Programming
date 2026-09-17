// Input : 7
// Output :
/*
    *   *   *   *           *
                *           *
                *           *
    *   *   *   *   *   *   *
    *           *
    *           *
    *           *   *   *   *
*/
import java.util.Scanner;

class program55
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
                if(i == 1)
                {
                    if(j <= (n/2)+1 || j == n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                else if(i <= n/2)
                {
                    if(j == (n/2)+1 || j == n)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                else if(i == (n/2)+1)
                {
                    System.out.print("* ");

                }
                else if(i < n)
                {
                    if(j == 1 || j == (n/2)+1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
                else
                {
                    if(j == 1 || j >= (n/2)+1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }

                }
            }
            System.out.println();
        }

        

        
    }
}