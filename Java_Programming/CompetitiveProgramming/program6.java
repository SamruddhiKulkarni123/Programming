// First 10 fibonacci numberes

import java.util.Scanner;

class program6
{
    public static void main(String A[])
    {
        int Arr[] = new int[10];

        int i = 0;

        for(i = 0; i < 10; i++)
        {
            if(i == 0)
            {
                Arr[i] = 0;
            }
            else if(i == 1)
            {
                Arr[i] = 1;
            }
            else
            {
                Arr[i] = Arr[i-1] + Arr[i - 2];
            }
        }

        for(i = 0; i < 10; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}