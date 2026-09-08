// print prime factorization of number
// ex:
// No = 450
// Output : 2 3 3 5 5

import java.util.Scanner;

class program19
{
    public static void main(String A[])
    {
        int No = 0;
    
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number : ");
        No = sobj.nextInt();

        int divisor = 0;

        for(divisor = 2; divisor * divisor <= No; divisor++)
        {
            while(No % divisor == 0)
            {
                No = No / divisor;
                System.out.print(divisor+" ");
            }
            
        }

        if(No > 1)
        {
            System.out.print(No);
        }
    }
}