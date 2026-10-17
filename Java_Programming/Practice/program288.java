// Accept name of file and check whether that file is exists or not.
// If File is not exists then create it.

import java.io.*;

class program288
{
    public static void main(String A[]) 
    {
        File fobj = null;
        boolean bRet = false;

        try
        {
            fobj = new File("Demo.txt");
            
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