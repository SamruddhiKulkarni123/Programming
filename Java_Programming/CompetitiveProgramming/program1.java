import java.util.Scanner;

class program1
{
    public static void main(String A[])
    {
        int Marks = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter marks : ");
        Marks = sobj.nextInt();

        if(Marks > 90)
        {
            System.out.println("Excellent");
        }
        else if(Marks > 80)
        {
            System.out.println("Good");
        }
        else if(Marks > 70)
        {
            System.out.println("Fair");
        }
        else if(Marks > 60)
        {
            System.out.println("Meets Expectations");
        }
        else
        {
            System.out.println("Below par");
        }
    }
}