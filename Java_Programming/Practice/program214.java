//Accept string from user and display its reverse

import java.util.Scanner;

class StringX
{
    public void DisplayReverse(String str)
    {
        
        StringBuilder reversed = new StringBuilder(str);
        reversed = reversed.reverse();

        str = new String(reversed);

        System.out.println(str);
        
    }

}
class program214
{

    public static void main(String A[])
    {
        String data = null;

        Scanner sobj = new Scanner(System.in);
        StringX strobj = new StringX();

        System.out.println("Enterr String : ");
        data = sobj.nextLine();

        strobj.DisplayReverse(data);

    }
}