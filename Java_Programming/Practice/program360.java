// File Unpacker

import java.io.*;
import java.util.*;

class program360
{
    public static void main(String A[]) throws  Exception
    {
        String PackFileName = null;
        Scanner sobj = new Scanner(System.in);
        File fpackobj = null;
        FileInputStream fiobj = null;
        FileOutputStream foobj = null;

        byte Header[] = new byte[100];
        String strHeader = null;
        String Tokens[] = null;
        File NewFile = null;
        byte Buffer[] = null;

        System.out.println("Enter the name of packed file :");
        PackFileName = sobj.nextLine();

        fpackobj = new File(PackFileName);

        

        if(fpackobj.exists())
        {
            fiobj = new FileInputStream(fpackobj);
            
            // read header
            fiobj.read(Header,0,100);

            strHeader = new String(Header);

            System.out.println("Header is : "+strHeader);

            strHeader = strHeader.trim();
            strHeader = strHeader.replaceAll("\\s+"," ");

            Tokens = strHeader.split(" ");

            System.out.println("File Name :"+Tokens[0]);
            System.out.println("File size :"+Tokens[1]);

            NewFile = new File(Tokens[0]);
            NewFile.createNewFile();

            foobj = new FileOutputStream(NewFile);

            Buffer = new byte[Integer.parseInt(Tokens[1])];

            // read data
            fiobj.read(Buffer,0,Integer.parseInt(Tokens[1]));

            //write data
            foobj.write(Buffer, 0, Integer.parseInt(Tokens[1]));


        }
        else
        {
            System.out.println("There is no such pack file");
        }

    }
}