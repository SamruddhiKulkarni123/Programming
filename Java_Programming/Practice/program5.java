// Program to perforrm addition of two integers

import java.util.Scanner;

class ArithmeticOperations
{
    public int iNo1 = 0;
    public int iNo2 = 0;
    public int iAns = 0;

    public ArithmeticOperations(int iNo1, int iNo2)
    {
        this.iNo1 = iNo1;
        this.iNo2 = iNo2;
        this.iAns = 0;
    }

    public int AddTwoNumbers()
    {
        iAns = iNo1 + iNo2;

        return iAns;
        
    }

}
class AdditionXXX
{

    public static void main(String A[])
    {
        int iValue1 = 0;
        int iValue2 = 0;
        int iRet = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number:");
        iValue1 = sc.nextInt();

        System.out.print("Enter second number:");
        iValue2 = sc.nextInt();

        ArithmeticOperations aobj = new ArithmeticOperations(iValue1, iValue2);

        iRet = aobj.AddTwoNumbers();
        System.out.println("Addition is:"+iRet);

    }
}

