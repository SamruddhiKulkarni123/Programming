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

class program14
{
    public static void main(String A[])
    {
        int iNo = 0;
        int K = 0;
        int iCount = 0;
        int iDigit = 0;
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

        while(K != 0)
        {
            if(K > 0)
            {
                iDigit = iNo % 10;
                iNo = iNo / 10;
                iNo = iNo + (iDigit * (int)Math.pow(10,iCount-1));
                K--;

            }
            else
            {
                iDigit = iNo / ((int)Math.pow(10,iCount-1));
                iNo = iNo % ((int)Math.pow(10,iCount-1));
                iNo = (iNo * 10) + iDigit;
                K++;
            }
        }

        System.out.println(iNo);
        
    }
}