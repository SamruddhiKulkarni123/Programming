// check whether given numbers forms a pythagarous triplet or not
// ex : 3 5 4
// 5^2 = 3^2 + 4^2    true


import java.util.Scanner;

class program20
{
    public static void main(String A[])
    {
        int a = 0, b = 0, c = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter first number : ");
        a = sobj.nextInt();

        System.out.println("Enter second number : ");
        b = sobj.nextInt();

        System.out.println("Enter third number : ");
        c = sobj.nextInt();

        int max = a;

        if(b >= max)
        {
            max = b;
        }

        if(c >= max)
        {
            max = c;
        }

        if(max == a)
        {
            boolean bFlag = ((a*a) == (b*b + c*c));
            System.out.println(bFlag);
        }
        else if(max == b)
        {
            boolean bFlag = ((b*b) == (a*a + c*c));
            System.out.println(bFlag);
        }
        else
        {
            boolean bFlag = ((c*c) == (a*a + b*b));
            System.out.println(bFlag);
        }
    }
}