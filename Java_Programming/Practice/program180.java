// Accept string from user and display it on screen

import java.util.*;

class program180
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Arr = null;

        System.out.println("Enter string : ");
        Arr = sobj.nextLine();

        System.out.println("Entered string : "+Arr);
    }
}