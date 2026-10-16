// Accept name of file and create new file

import java.io.*;

class program284
{
    public static void main(String A[]) 
    {
        try
        {
            File fobj = new File("Demo.txt");

            fobj.createNewFile();       
        }
        catch(IOException iobj)
        {
            System.out.println(iobj);

        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }

    }
}