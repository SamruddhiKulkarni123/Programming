// Check whether number is even or odd

import java.util.Scanner;

class Numbers
{
    public boolean CheckEvenOdd(int iNo)
    {
        int iRemainder = 0;

        iRemainder = iNo % 2;

        if(iRemainder == 0)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
class program12
{
    

    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        
        Scanner sc = new Scanner(System.in);
        Numbers nobj = new Numbers();

        System.out.println("Enter number : ");
        iValue = sc.nextInt();

        bRet = nobj.CheckEvenOdd(iValue);

        if(bRet == true)
        {
            System.out.println("Number is Even");
        }

        else
        {
            System.out.println("Number is Odd");
        }

    }

}