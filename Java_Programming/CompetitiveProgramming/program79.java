/*
Balanced Bracket problem

1. You are given a string exp representing an expression.
2. You are required to check if the expression is balanced i.e. closing brackets and opening brackets match up well.

e.g.
[(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)}] -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false
*/

import java.util.*;

class program79
{
    public static boolean checkOpeningBracket(Stack <Character> st, char AppropeningBracket)
    {
        if(st.size() == 0)
        {
            return false;
        }
        else if(st.peek() != AppropeningBracket)
        {
            return false;
        }
        else
        {
            st.pop();
            return true;
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Stack <Character> st = new Stack<Character>();

        System.out.println("Enter an expression : ");
        String exp = sobj.nextLine();

        boolean bFlag = true;
        int i = 0;
        char ch = '\0';

        for(i = 0; i < exp.length(); i++)
        {
            ch = exp.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{')
            {
                st.push(ch);
            }
            else if(ch == ')')
            {
                bFlag = checkOpeningBracket(st,'(');
                if(bFlag == false)
                {
                    break;
                }
            }
            else if(ch == '}')
            {
                bFlag = checkOpeningBracket(st,'{');
                if(bFlag == false)
                {
                    break;
                }

            }
            else if(ch == ']')
            {
                bFlag = checkOpeningBracket(st,'[');
                if(bFlag == false)
                {
                    break;
                }

            }
        }

        if(st.size() == 0 && bFlag == true)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }


    }
}