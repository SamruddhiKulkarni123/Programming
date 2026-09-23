// Sum of two Arrays
/*
You are given a number n1, representing the size of array a1.
You are given n1 numbers, representing elements of array a1.
You are given a number n2, representing the size of array a2.
You are given n2 numbers, representing elements of array a2.
The two arrays represent digits of two numbers.
You are required to add the numbers represented by two arrays and print the arrays
*/

import java.util.*;

class program75
{
    public static void main(String A[])
    {
        int n1 = 0;
        int n2 = 0;
        int i = 0, j = 0, k = 0;
        int a1[];
        int a2[];
        int sum[];


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

        sum = new int[n1 > n2 ? n1 : n2];

        i = a1.length - 1;
        j = a2.length - 1;
        k = sum.length - 1;
        int carry = 0;
        int digit = 0;

        while(k >= 0)
        {
            digit = carry;

            if(i >= 0)
            {
                digit = digit + a1[i];
            }

            if(j >= 0)
            {
                digit = digit + a2[j];
            }

            carry = digit / 10;
            
            sum[k] = digit % 10;

            i--;
            j--;
            k--;



        }

        System.out.println("Addition is : ");

        if(carry != 0)
        {
            System.out.print(carry);
        }

        for(int val : sum)
        {
            System.out.print(val);
        }
        
        

    }
}