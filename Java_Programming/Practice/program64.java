// print Digits of number

class program64
{
    public static void main(String A[])
    {
        int iNo = 751;
        int iDigit = 0;

        while(iNo != 0)
        {
            iDigit = iNo % 10;
            System.out.println(iDigit);
            iNo = iNo / 10;

        }
    
        
    }
}