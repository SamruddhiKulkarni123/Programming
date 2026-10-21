// Accept sstring and convert it into byte array
// Then display size of string as well as array

import java.io.*;
import java.util.*;

class program301
{
    public static void main(String A[]) 
    {
        String Data = "Marvellous Infosystems";

        byte Arr[] = Data.getBytes();
        
        System.out.println(Data.length());
        System.out.println(Arr.length);

    }
}