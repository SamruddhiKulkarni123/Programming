/*
Largesst Rectangle in Histogram

You are given a number n, representing the size of array a.
You are given n numbers, representing the height of bars in a bar chart.
You are required to find and print the area of largest rectangle in the histogram.

e.g.
for the array [6 2 5 4 5 1 6] -> 12

Constraints
0 <= n < 20
0 <= a[i] <= 10

*/

import java.util.*;

class program85
{
    public static int FindingLargestRectangleArea(int Arr[])
    {
        int i = 0;
        Stack <Integer> st = new Stack <Integer>();

        int rb[] = new int[Arr.length];
        st.push(Arr.length - 1);
        rb[Arr.length - 1] = Arr.length;

        for(i = Arr.length - 2; i >= 0; i--)
        {
            while(st.size() > 0 && Arr[i] <= Arr[st.peek()])
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                rb[i] = Arr.length;
            }
            else
            {
                rb[i] = st.peek();
            }

            st.push(i);

        }

        int lb[] = new int[Arr.length];
        st.push(0);
        lb[0] = -1;

        for(i = 1; i < Arr.length; i++)
        {
            while(st.size() > 0 && Arr[i] <= Arr[st.peek()])
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                lb[i] = -1;
            }
            else
            {
                lb[i] = st.peek();
            }

            st.push(i);

        }

        int maxArea = 0;
        int width = 0;
        int area = 0;


        for(i = 0; i < Arr.length; i++)
        {
            width = rb[i] - lb[i] - 1;

            area = width * Arr[i];

            if(area > maxArea)
            {
                maxArea = area;
            }

        }

        return maxArea;

    }

    public static void main(String A[])
    {
        int n = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        n = sobj.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter height of bars in bar chart : ");

        for(int i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int iRet = FindingLargestRectangleArea(Arr);

        System.out.println("Area of largest rectangle in histogram is : "+iRet);


    }
}