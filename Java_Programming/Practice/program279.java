//Accept array from user and display it on screen also perform addition of elements

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

    public int Summation()
    {
        int i = 0;
        int sum = 0;

        for(i = 0; i < Arr.length; i++)
        {
            sum = sum + Arr[i];
        }

        return sum;
    }


}
class program279
{
    public static void main(String A[])
    {
        int size = 0;
        int iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        size = sobj.nextInt();

        ArrayX aobj = new ArrayX(size);

        aobj.Accept();
        aobj.Display();

        iRet = aobj.Summation();
        System.out.println("Summation is : "+iRet);

    }
}