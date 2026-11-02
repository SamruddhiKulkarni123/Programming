// Input : my name is amit
// Output : My Name Is Amit

// Input : my naMe Is AmIt
// Output : My Name Is Amit

// converted into character array and by using for loop displayes each letter

import java.util.*;

class program369
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        char Arr[] = str.toCharArray();


        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
        

    }
}