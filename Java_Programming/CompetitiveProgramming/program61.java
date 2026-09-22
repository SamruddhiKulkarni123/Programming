// permutation (nPr)
// n = 5
// r = 2
// 5P2 = (5!)/(5-2)! = 20

import java.util.Scanner;

class program61
{
    public static int Factorial(int x)
    {
        int Ans = 1;

        for(int i = 1; i <= x; i++)
        {
            Ans = Ans * i;
        }

        return Ans;

    }

    public static void DisplayResult(int n, int r, int npr)
    {
        System.out.println(n+"P"+r+" = "+npr);
    }

    public static void main(String A[])
    {
        int n = 0;
        int r = 0;
        int nfact = 0;
        int nmrfact = 0;
        int npr = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter value of n : ");
        n = sobj.nextInt();

        System.out.println("Enter value of r : ");
        r = sobj.nextInt();

        nfact = Factorial(n);
        nmrfact = Factorial(n - r);
        
        npr = nfact / nmrfact;

        DisplayResult(n,r,npr);
        


    }
}