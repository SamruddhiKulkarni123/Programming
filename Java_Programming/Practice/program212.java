//Accept string from user and display its reverse

import java.util.Scanner;

class StringX
{
    public void DisplayReverse(String str)
    {
        int i = 0;

        for(i = str.length()-1; i >= 0; i--)
        {
            System.out.print(str.charAt(i));
        }
        
    }

}
class program212
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