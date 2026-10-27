// Accept string from user and print length of string before and after removing leading and trailing white spaces
// as well as removing single whitespace

import java.util.*;

class program335
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String str =null;

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        System.out.println("Input string is : "+str+" Having length :"+str.length());

        str = str.trim();
        System.out.println("Input string is : "+str+" Having length :"+str.length());

        str = str.replaceAll(" ","");
        System.out.println("Input string is : "+str+" Having length :"+str.length());
    }
}