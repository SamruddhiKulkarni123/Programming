// Difference of two Arrays
/*
You are given a number n1, representing the size of array a1.
You are given n1 numbers, representing elements of array a1.
You are given a number n2, representing the size of array a2.
You are given n2 numbers, representing elements of array a2.
The two arrays represent digits of two numbers.
You are required to find the difference of two numbers represented by two arrays and print the arrays a2 - a1

Assumption : number represented by a2 is greater
*/

import java.util.*;

class program76
{
    public static void main(String A[])
    {
        int n1 = 0;
        int n2 = 0;
        int i = 0, j = 0, k = 0;
        int a1[];
        int a2[];
        int diff[];


        Scanner sobj = new Scanner(System.in);

        System.out.println("How many elements you want to store in first array : ");
        n1 = sobj.nextInt();
        a1 = new int[n1];
        System.out.println("Enter elements of array : ");
        for(i = 0; i < a1.length; i++)
        {
            a1[i] = sobj.nextInt();
        }

        System.out.println("How many elements you want to store in second array : ");
        n2 = sobj.nextInt();
        a2 = new int[n2];
        System.out.println("Enter elements of array : ");
        for(i = 0; i < a2.length; i++)
        {
            a2[i] = sobj.nextInt();
        }

        diff = new int[n2];

        i = a2.length - 1;
        j = a1.length - 1;
        k = diff.length - 1;
        int borrow = 0;
        int digit = 0;
        int a1Val = 0;

        while(k >= 0)
        {
            a1Val = j >= 0? a1[j] : 0;

            if(a2[i] >= (a1Val+borrow))
            {
                digit = a2[i] - (a1Val + borrow); 
                borrow = 0;
            }
            else
            {
                digit = (a2[i] + 10) - (a1Val + borrow);
                borrow = 1;
            }
            
            diff[k] = digit;

            i--;
            j--;
            k--;

        }

        int index = 0;

        while(index < diff.length)
        {
            if(diff[index] == 0)
            {
                index++;
            }
            else
            {
                break;
            }
        }

        System.out.println("Substraction is : ");

        while(index < diff.length)
        {
            System.out.print(diff[index]);
            index++;
        }

        
        

    }
}