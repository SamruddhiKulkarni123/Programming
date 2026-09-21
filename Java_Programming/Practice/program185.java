// Accept string from user, convert it into character array and dispaly each letter of array

import java.util.*;

class program185
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Arr = null;

        System.out.println("Enter string : ");
        Arr = sobj.nextLine();

        System.out.println("Length of string is : "+Arr.length());

        char str[] = Arr.toCharArray();

        int i = 0;
        for(i = 0; i < str.length; i++)
        {
            System.out.println(str[i]);
        }
        
    }
}