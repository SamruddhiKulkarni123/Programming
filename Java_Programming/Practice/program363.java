// Accept string and find length of each token

import java.util.*;

class program363
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

        for(int i = 0; i < Tokens.length; i++)                                  // to count length of every token
        {
            System.out.println(Tokens[i]+" : "+Tokens[i].length());
        }

    }
}