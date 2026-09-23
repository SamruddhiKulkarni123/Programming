// Bar chart question
//Take length of array from user and also take that number of elements from user .
// Print a bar chart of asterisks representing value of element.
//ex :
//  n = 5
//Arr = {3,5,2,6,1}
// Output : 

//              *  
//      *       *  
//      *       *
//  *   *       *
//  *   *   *   *
//  *   *   *   *   *

import java.util.*;

class program74
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0, j = 0;
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

        int max = Arr[0];

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] > max)
            {
                max = Arr[i];
            }
        }

        for(i = max; i >= 1; i--)
        {
            for(j = 0; j < Arr.length; j++)
            {
                if(Arr[j] >= i)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        } 

        

    }
}