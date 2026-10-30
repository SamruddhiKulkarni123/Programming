// File Packer Unpacker project 

import java.io.*;
import java.util.*;

class program350
{
    public static void main(String A[]) 
    {
        String header = "Hello.txt 1078";

        System.out.println("Actual header length : "+header.length()); //14

        System.out.println("Number of white spaces we need : "+(100 - header.length())); // 86

        int size = 100 - header.length();

        for(int i = 1; i <= size; i++)
        {
            header = header + " ";

        }
        
        System.out.println("Updated header length is : "+header.length());
        System.out.println("Updated header is : "+header);
    }
}