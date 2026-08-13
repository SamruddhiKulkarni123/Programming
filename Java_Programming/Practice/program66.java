// print Digits of number

import java.util.*;

class DigitX
{
    public static void DisplayDigits(int iNo)
    {
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;

        }
    

    }
}
class program66
{
    
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        DigitX.DisplayDigits(iValue);

        
        
    }
}