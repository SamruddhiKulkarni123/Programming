/*
Duplicate Bracket problem

1. You are given a string exp representing an expression.
2. Assume that the expression is balanced i.e. the opening and closing brackets match with each other.
3. But, some of the pair of brackets maybe extra/needless.
4. You are required to print true if you detect extra brackets and false otherwise.

e.g.
((a + b) + (c + d)) -> false
(a + b) + ((c + d)) -> true
*/

import java.util.*;

class program78
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Stack <Character> st = new Stack<Character>();

        System.out.println("Enter an expression : ");
        String exp = sobj.nextLine();

        boolean bFlag = false;
        int i = 0;
        char ch = '\0';

        for(i = 0; i < exp.length(); i++)
        {
            ch = exp.charAt(i);

            if(ch == ')')
            {
                if(st.peek() == '(')
                {
                    bFlag = true;
                    break;
                }
                else
                {
                    while(st.peek() != '(')
                    {
                        st.pop();

                    }
                    st.pop();

                }
            }
            else
            {
                st.push(ch);
                
            }
        }

        System.out.println(bFlag);


    }
}