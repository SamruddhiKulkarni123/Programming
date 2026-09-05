import java.util.Scanner;

class program5
{
    public static void main(String A[])
    {
        int low = 0;
        int high = 0;
        
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter lower limit: ");
        low = sobj.nextInt();

        System.out.println("Enter higher limit: ");
        high = sobj.nextInt();

        System.out.println("Prime numbers in given range are : ");

        for(int no = low; no <= high; no++)
        {
            boolean bFlag = true;

            if(no < 2)
            {
                bFlag = false;
            }
            else
            {
                for(int i = 2; i <= no/2; i++)
                {
                    if(no % i == 0)
                    {
                        bFlag = false;
                        break;
                    }

                }
            }
            
            if(bFlag == true)
            {
                System.out.print(no+"\t");
            }
            
        }

    }
}