// Accept name of file and check whether that file is exists or not

import java.io.*;

class program285
{
    public static void main(String A[]) 
    {
        try
        {
            File fobj = new File("Demo.txt");

            System.out.println(fobj.exists());
        }
        catch(Exception eobj)
        {
            System.out.println(eobj);
        }

    }
}