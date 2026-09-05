import java.util.Scanner;

class program2
{
    public static void main(String A[])
    {
        int t = 0;
        int n = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("For how many number you want to check prime condition : ");
        t = sobj.nextInt();

        for(int i = 1; i <= t; i++)
        {
            n = sobj.nextInt();

            int iCount = 0;


            for(int j = 1; j <= n; j++)
            {
                if(n % j == 0)
                {
                    iCount++;
                }
            }

            if(iCount == 2)
            {
                System.out.println("Prime");
            }
            else
            {
                System.out.println("Not Prime");
            }
        }


    }
}