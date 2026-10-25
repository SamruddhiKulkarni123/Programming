// Accept name of folder from user and Display name of all files from that folder

import java.io.*;
import java.util.*;

class program316
{
    public static void main(String A[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = null;

        System.out.println("Enter folder name : ");
        FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if((fobj.exists()) && (fobj.isDirectory()))
        {
            System.out.println("Folder exists");

            File fArr[] = fobj.listFiles();

            System.out.println("Number of files in folder : "+fArr.length);

            for(int i = 0; i < fArr.length; i++)
            {
                System.out.println(fArr[i].getName());
            }
        }
        else
        {
            System.out.println("There is no such folder");
        }
    }
}