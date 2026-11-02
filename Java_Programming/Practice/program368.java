// Input : my name is amit
// Output : My Name Is Amit

// Input : my naMe Is AmIt
// Output : My Name Is Amit

// In this we only converted string into lowercase using toLowerCase() method

import java.util.*;

class program368
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");

        str = str.toLowerCase();

        System.out.println(str);

        

    }
}