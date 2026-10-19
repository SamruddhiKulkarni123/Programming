// Data writing in file

import java.io.*;
import java.util.*;

class program293
{
    public static void main(String A[]) 
    {
        FileWriter fwobj = null;

        try
        {
            fwobj = new FileWriter("Demo.txt");

            fwobj.write("Jay Ganesh...");

            fwobj.close();      // Imp

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