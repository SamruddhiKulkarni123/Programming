// input : india is my country i live in india
// output : bharat is my country i live in bharat

// we checkes frequency of india

import java.util.*;

class program378
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        
        String Tokens[] = str.split(" ");

        int iCount = 0;

        for(int i = 0; i < Tokens.length; i++)
        {
            if(Tokens[i].equals("india"))
            {
                iCount++;
            }
        }

        System.out.println("Frequency of word is : "+iCount);
    }
}