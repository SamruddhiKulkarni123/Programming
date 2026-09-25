/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to "next greater element on the right" for all elements of array
4. Input and output is handled for you.

"Next greater element on the right" of an element x is defined as the first element to right of x having value greater than x.
Note -> If an element does not have any element on it's right side greater than it, consider -1 as it's "next greater element on right"
e.g.
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is 5
Next greater for 5 is 9
Next greater for 9 is 12
Next greater for 3 is 12
Next greater for 1 is 12
Next greater for 12 is -1
Next greater for 6 is 8
Next greater for 8 is -1
Next greater for 7 is -1
*/

import java.util.*;

class program82
{
    public static int[] NextGreaterElementFinding(int Arr[])
    {
        int nge[] = new int[Arr.length];

        Stack<Integer> st = new Stack<Integer>();

        st.push(0);

        int pos = 0;

        for(int i = 1; i < Arr.length; i++)
        {
            while(st.size() > 0 && Arr[st.peek()] < Arr[i])
            {
                pos = st.peek();
                nge[pos] = Arr[i];
                st.pop();

            }

            st.push(i);
        }

        while(st.size() > 0)
        {
            pos = st.peek();
            nge[pos] = -1;
            st.pop();
        }

        return nge;

    }

    public static void DisplayResult(int nge[])
    {
        System.out.println("Array og next greater element is : ");

        for(int i = 0; i < nge.length; i++)
        {
            System.out.println(nge[i]);
        }
    }

    public static void main(String A[])
    {
        int n = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        n = sobj.nextInt();

        int Arr[] = new int[n];

        System.out.println("Enter elements of array : ");

        for(int i= 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }

        int nge[] = NextGreaterElementFinding(Arr);

        DisplayResult(nge);
        
        
    }
}