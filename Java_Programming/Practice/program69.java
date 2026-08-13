// print Digits of number

import java.util.*;

class DigitX
{
    public void DisplayDigits(int iNo)
    {

        while(iNo != 0)
        {
            System.out.println(iNo % 10);
            iNo = iNo / 10;

        }
    

    }
}
class program69
{
    
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();
        
        System.out.println("Enter number : ");
        iValue = sobj.nextInt();

        dobj.DisplayDigits(iValue);

        
        
    }
}