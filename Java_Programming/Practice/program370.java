// Input : my name is amit
// Output : My Name Is Amit

// Input : my naMe Is AmIt
// Output : My Name Is Amit

// we make first letter capital except first token

import java.util.*;

class program370
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
            if(Arr[i] == ' ')
            {    
                if(Arr[i + 1] >= 'a' && Arr[i + 1] <= 'z')
                {
                    Arr[i + 1] = (char)(Arr[i+1] - 32);
                }
            }
            
        }

        String Output = new String(Arr);
        
        System.out.println("Updated string is : "+Output);
        

    }
}