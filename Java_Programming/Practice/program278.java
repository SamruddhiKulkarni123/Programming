//Accept array from user and display it on screen

import java.util.Scanner;

class ArrayX
{
    public int Arr[];

    public ArrayX(int size)
    {
        this.Arr = new int[size];
    }

    public void Accept()
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextInt();
        }
    }

    public void Display()
    {
        int i = 0;

        System.out.println("Elements of array are : ");

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }


}
class program278
{
    public static void main(String A[])
    {
        int size = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        size = sobj.nextInt();

        ArrayX aobj = new ArrayX(size);

        aobj.Accept();
        aobj.Display();

    }
}