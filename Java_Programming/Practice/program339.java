// Count number of words in string and print words

import java.util.*;

class program339
{
    public static void main(String A[])
    {
        String header = "india  is  my  country";

        String Arr[] = header.split(" ");

        System.out.println("Number of words :"+Arr.length);

        for(int i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}