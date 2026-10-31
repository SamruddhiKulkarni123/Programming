// File Packer

import java.io.*;
import java.util.*;

class program353
{
    public static void main(String A[]) throws Exception
    {
        int iRet = 0;
        int size = 0;
        int i = 0, j = 0;

        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;
        String header = "";

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        System.out.println("Enter folder name : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        PackFileName = sobj.nextLine();

        File fobjfolder = new File(FolderName);


        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();                   // pack file gets createdc

            foobj = new FileOutputStream(fobjpack);


            File fArr[] = fobjfolder .listFiles();

            System.out.println("Number of files in folder : "+fArr.length);

            byte Buffer[] = new byte[1024];

            for(i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                header = header + fArr[i].getName();
                header = header + " ";
                header = header + fArr[i].length();

                System.out.println("header is : "+header);

                size = 100 - header.length();

                for(j = 1; j <= size; j++)
                {
                    header = header + " ";
                }

                System.out.println("Header length is : "+header.length());

                // Write file name and size
                

                /*// Loop to read from fiobj and write to foobj

                while((iRet = fiobj.read(Buffer)) != -1)
                {
                    foobj.write(Buffer, 0, iRet);

                }*/
                
                fiobj.close();
                header = "";
    
            }
            foobj.close();
            sobj.close();
            
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}