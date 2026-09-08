// print inverse of a given number
// ex: 1
// position  5 4 3 2 1
// number    1 5 2 3 4

// output 
// position  5 4 3 2 1
// number    4 1 2 3 5

// ex: 2
// position  4 3 2 1
// number    2 1 4 3

// output 
// position  4 3 2 1
// number    2 1 4 3


import java.util.Scanner;

class program12
{
    public static void main(String A[])
    {
        int iNo = 0;
        int iDigit = 0;
        int iCount = 0;
        int iPow = 0;
        int NewNumber = 0;

        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            iCount++;
            iDigit = iNo % 10;
            iPow = (int)Math.pow(10,iDigit-1);
            NewNumber = NewNumber + (iCount * iPow);
            iNo = iNo / 10;

        }

        System.out.println(NewNumber);

        
    }
}