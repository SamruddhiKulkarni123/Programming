//Take length of array from user and also take that number of elements from user .
// Accept one other number from user and find the number is present in array or not , if found return its index otherwise return -1.

import java.util.*;

class program73
{
    public static void main(String A[])
    {
        int n = 0;
        int i = 0;
        int No = 0;
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

        System.out.println("Enter number to find in array : ");
        No = sobj.nextInt();

        int index = -1;

        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == No)
            {
                index = i;
                break;
            }
        }

        
        System.out.println("Element is found at index : "+index);
    

        

    }
}