//Accept string from user and display its reverse

import java.util.Scanner;

class StringX
{
    public void DisplayReverse(String str)
    {
        
        char Arr[] = str.toCharArray();

        for(int i = Arr.length - 1; i >= 0; i--)
        {
            System.out.print(Arr[i]);
        }

        
    }

}
class program213
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