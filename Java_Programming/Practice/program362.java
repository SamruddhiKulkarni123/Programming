// Accepts string from user , removes starting and ending white spaces ,replaces multiple white spaces with single white space
//, makes tokens and with the help of tokens count number of words

import java.util.*;

class program362
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
 
        String Tokens[] = str.split(" ");

        System.out.println("Number of words : "+Tokens.length);

    }
}