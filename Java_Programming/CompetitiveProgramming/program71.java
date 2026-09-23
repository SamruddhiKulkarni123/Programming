//Take length of array from user and also take that number of elements from user and find the spam of input(Difference
//between biggest and smallest number)

import java.util.*;

class program71
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int Arr[];

        Scanner sobj = new Scanner(System.in);

        System.out.println("How many elements you want to store in array : ");
        n = sobj.nextInt();

        Arr = new int[n];

        System.out.println("Enter elements of array : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int Smallest = Arr[0];
        int Biggest = Arr[0];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] < Smallest)
            {
                Smallest = Arr[i];
            }

            if(Arr[i] > Biggest)
            {
                Biggest = Arr[i];
            }
        }

        System.out.println("Difference between Biggest and Smallest number is : "+(Biggest - Smallest));


    }
}