// Take name , age and marks from user and display it on screen

import java.util.*;

class program35
{
    public static void Display(String name, int age, float marks)
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);


    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        String sName = null;
        int iAge = 0;
        float fMarks = 0.0f;

        System.out.println("Enter your name : ");
        sName = sobj.nextLine();

        System.out.println("Enter your Age: ");
        iAge = sobj.nextInt();

        System.out.println("Enter your Marks : ");
        fMarks = sobj.nextFloat();

        Display(sName, iAge, fMarks);
    }
}