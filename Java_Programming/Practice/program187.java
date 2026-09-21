// Accept string from user and dispaly its length before and after initialization

import java.util.*;

class program187
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String str = new String();
        
        System.out.println(str.length());

        System.out.println("Enter string : ");
        str = sobj.nextLine();

        System.out.println("String is : "+str);

        System.out.println(str.length());
    }
}