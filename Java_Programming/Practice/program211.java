//Accept string from user and display it

import java.util.Scanner;

class StringX
{
    public void Display(String str)
    {
        System.out.println(str);
    }

}
class program211
{

    public static void main(String A[])
    {
        String str = null;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enterr String : ");
        str = sobj.nextLine();

        strobj.Display(str);

    }
}