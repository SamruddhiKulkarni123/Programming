// Packer Unpacker

// Packer part

import java.io.*;
import java.util.*;

class program318
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;
        String PackFileName = null;

        System.out.println("Enter folder name : ");
        FolderName = sobj.nextLine();

        System.out.println("Enter the name of packed file : ");
        PackFileName = sobj.nextLine();

        File fobjfolder = new File(FolderName);

        if((fobjfolder.exists()) && (fobjfolder.isDirectory()))
        {
            System.out.println("Folder exists");

            File fobjpack = new File(PackFileName);
            fobjpack.createNewFile();                   // pack file gets created

            File fArr[] = fobjfolder .listFiles();

            System.out.println("Number of files in folder : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                // Logic
    
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}