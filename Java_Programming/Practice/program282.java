// Accept name of file and create file

import java.io.*;

class program282
{
    public static void main(String A[])
    {
        File fobj = new File("Demo.txt");

        fobj.createNewFile();       // Exception

    }
}