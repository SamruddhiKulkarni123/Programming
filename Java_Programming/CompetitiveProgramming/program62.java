// find frequency of digit in given number
// n = 1345238313
// d = 3
// Output : 4

import java.util.Scanner;

class program62
{
    public static int Frequency(int n, int d)
    {
        int iCount = 0;
        int iDigit = 0;

        while(n != 0)
        {
            iDigit = n % 10;

            if(iDigit == d)
            {
                iCount++;
            }

            n = n / 10;
        }

        return iCount;
        

    }

    public static void main(String A[])
    {
        int n = 0;
        int d = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        n = sobj.nextInt();

        System.out.println("Enter digit to find frequency : ");
        d = sobj.nextInt();

        iRet = Frequency(n,d);

        System.out.println("Frequency of "+d+" in "+n+" is : "+iRet);

    }
}