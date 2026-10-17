// Accept name of file and check whether that file is exists or not.
// If File is not exists then create it.

import java.io.*;

class program287
{
    public static void main(String A[]) 
    {
        try
        {
            File fobj = new File("Demo.txt");
            boolean bRet = false;

            bRet = fobj.exists();

            if(bRet == true)
            {
                System.out.println("File already exists");
            }
            else
            {
                fobj.createNewFile();  
                System.out.println("File gets successsfully created");
            }

                 
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