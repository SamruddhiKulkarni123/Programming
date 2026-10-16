// Accepting name of file create that file

import java.io.*;

class program283
{
    public static void main(String A[]) throws IOException
    {
        File fobj = new File("Demo.txt");

        fobj.createNewFile();       
    }
}