// Take name , age and marks from user and display it on screen

import java.util.*;

class Information
{
    public String name;
    public int age;
    public float marks;

    public Information(String S_Name,int S_Age, float S_Marks)
    {
        this.name = S_Name;
        this.age = S_Age;
        this.marks = S_Marks;
    }

    public void Display()
    {
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("Marks : "+marks);


    }
}
class program37
{
    
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

        Information iobj = new Information(sName, iAge, fMarks);

        iobj.Display();
    }
}