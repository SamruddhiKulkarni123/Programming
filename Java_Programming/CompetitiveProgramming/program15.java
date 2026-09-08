// Rotate a number in given times

// ex : 1
// number : 45623
// K : 2
// 1st rotation : 34562
// 2nd rotation : 23456

// ex : 2
// number : 2987
// K : -3
// 1st rotation : 9872
// 2nd rotation : 8729
// 3rd rotation : 7298

import java.util.Scanner;

class program15
{
    public static void main(String A[])
    {
        int iNo = 0;
        int K = 0;
        int iCount = 0;
        int temp = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        System.out.println("How many times you want to rotate a number : ");
        K = sobj.nextInt();

        temp = iNo;

        while(temp != 0)
        {
            iCount++;
            temp = temp / 10;
        }

        if(K < 0)
        {
            K = K + iCount;
        }

        int div = 1;
        int mult = 1;

        for(int i = 1; i <= iCount; i++)
        {
            if(i <= K)
            {
                div = div * 10;
            }
            else
            {
                mult = mult * 10;
            }
        }

        int quotient = iNo / div;
        int remainder = iNo % div;

        int RotatedNo = (remainder * mult) + quotient;

        System.out.println(RotatedNo);

        
    }
}