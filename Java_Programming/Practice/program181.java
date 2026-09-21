// Accept string from user and dispaly each letter of string

import java.util.*;

class program181
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Arr = null;

        System.out.println("Enter string : ");
        Arr = sobj.nextLine();

        // Error
        System.out.println(Arr[0]);         // charAt method in java
        System.out.println(Arr[1]);
        System.out.println(Arr[2]);
        
    }
}