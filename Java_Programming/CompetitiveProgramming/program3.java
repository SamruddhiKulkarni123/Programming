import java.util.Scanner;

class program3
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

            boolean bFlag = true;


            for(int j = 2; j <= n/2; j++)
            {
                if(n % j == 0)
                {
                    bFlag = false;
                    break;
                }
            }

            if(bFlag == true)
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