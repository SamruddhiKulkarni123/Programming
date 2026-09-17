// permutation (nPr)
// n = 5
// r = 2
// 5P2 = (5!)/(5-2)! = 20

import java.util.Scanner;

class program59
{
    public static void main(String A[])
    {
        int n = 0;
        int r = 0;
        int i = 0;
        int nfact = 1;
        int nmrfact = 1;
        int npr = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter value of n : ");
        n = sobj.nextInt();

        System.out.println("Enter value of r : ");
        r = sobj.nextInt();

        for(i = 1; i <= n; i++)
        {
            nfact = nfact * i;
        }

        for(i = 1; i <= n-r; i++)
        {
            nmrfact = nmrfact * i;
        }

        npr = nfact / nmrfact;

        System.out.println(n+"P"+r+" = "+npr);


    }
}