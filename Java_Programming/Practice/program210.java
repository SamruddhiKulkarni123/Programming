//Accept string from user and display it

import java.util.Scanner;

class program210
{
    public static void Display(String str)
    {
        System.out.println(str);
    }

    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enterr String : ");
        str = sobj.nextLine();

        Display(str);

    }
}