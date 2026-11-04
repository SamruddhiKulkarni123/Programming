// Input : my name is amit
// Output : My Name Is Amit

// Input : my naMe Is AmIt
// Output : My Name Is Amit

// We make string in camel case(First letter of each token capital)

import java.util.*;

class program371
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

        if((Arr[0] >= 'a') && (Arr[0] <= 'z'))
        {
            Arr[0] = (char)(Arr[0] - 32);
        }

        for(int i = 0; i < Arr.length; i++)
        {
            if(Arr[i] == ' ')
            {
                
                if((Arr[i + 1] >= 'a') && (Arr[i + 1] <= 'z'))
                {
                    Arr[i + 1] = (char)(Arr[i + 1] - 32);
                }
            }
            
        }

        String Output = new String(Arr);
        
        System.out.println("Updated string is : "+Output);
        

    }
}