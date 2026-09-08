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

class program13
{
    public static void main(String A[])
    {
        int iNo = 0;
        int inverse = 0;
        int OriginalDigit = 0;
        int OriginalPlace = 0;
        int InvertedDigit = 0;
        int InvertedPlace = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        iNo = sobj.nextInt();

        while(iNo != 0)
        {
            OriginalPlace++;
            OriginalDigit = iNo % 10;

            InvertedDigit = OriginalPlace;
            InvertedPlace = OriginalDigit;

            inverse = inverse + (InvertedDigit * (int)Math.pow(10,InvertedPlace-1));

            iNo = iNo / 10;


        }

        System.out.println(inverse);

        
    }
}