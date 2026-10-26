// Packer unpacker

// Packer part

import java.io.*;
import java.util.*;

class program321
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        int iRet = 0;

        FileOutputStream foobj = null;
        FileInputStream fiobj = null;

        System.out.println("Enter folder name : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        PackFileName = sobj.nextLine();

        File fobjfolder = new File(FolderName);

        byte Buffer[] = new byte[10];

        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();                   // pack file gets createdc

            foobj = new FileOutputStream(fobjpack);


            File fArr[] = fobjfolder.listFiles();

            System.out.println("Number of files in folder : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                fiobj = new FileInputStream(fArr[i]);

                System.out.println(fArr[i].getName());

                // Write file name and size

                

                // Loop to read from fiobj and write to foobj
                
                fiobj.close();
    
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