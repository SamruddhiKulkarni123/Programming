/*
You are given a number n, representing the size of array a.
You are given n numbers, representing the prices of a share on n days.
You are required to find the stock span for n days.
Stock span is defined as the number of days passed between the current day and the first day before today when
 price was higher than today's price.

e.g.
for the array [2 5 9 3 1 12 6 8 7]
span for 2 is 1
span for 5 is 2
span for 9 is 3
span for 3 is 1
span for 1 is 1
span for 12 is 6
span for 6 is 1
span for 8 is 2
span for 7 is 1
*/

import java.util.*;

class program84
{
    public static int [] calculateSpan(int prices[])
    {
        int spanArray[] = new int[prices.length];

        Stack < Integer> st = new Stack<Integer>();

        st.push(0);
        spanArray[0] = 1;


        for(int i = 1; i < prices.length; i++)
        {
            while(st.size() > 0 && prices[st.peek()] < prices[i])
            {
                st.pop();
            }

            if(st.size() == 0)
            {
                spanArray[i] = i+1;
            }
            else
            {
                spanArray[i] = i - st.peek();
            }

            st.push(i);
        }

        return spanArray;

    }

    public static void DisplayResult(int spanArray[])
    {
        System.out.println("Span of each day :");
        for(int i = 0; i < spanArray.length; i++)
        {
            System.out.println(spanArray[i]);
        }
    }

    public static void main(String A[])
    {
        int n = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        n = sobj.nextInt();

        int prices[] = new int[n];

        System.out.println("Enter prices of a share on n days : ");

        for(int i = 0; i < prices.length; i++)
        {
            prices[i] = sobj.nextInt();
        }

        int spanArray[] = calculateSpan(prices);

        DisplayResult(spanArray);


    }
}