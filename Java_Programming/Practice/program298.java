// Read data from file and store it in buffer from third index

import java.io.*;
import java.util.*;

class program298
{
    public static void main(String A[]) 
    {
        FileReader frobj = null;
        int iRet = 0;

        char Buffer[] = new char[20];

        try
        {
            frobj = new FileReader("Demo.txt");

            frobj.read(Buffer,3,10);

            System.out.println(Buffer);
            

        }
        catch(IOException iobj)
        {
            System.out.println(iobj);
        }
        finally
        {
            
        }
        
         
        
    }
}