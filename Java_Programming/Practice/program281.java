//Accept array from user and display it on screen also perform addition of elements, make it generic

import java.util.Scanner;

class ArrayX <T extends Number>
{
    public Number Arr[];

    public ArrayX(int size)
    {
        this.Arr = new Number[size];
    }

    public void Accept()
    {
        int i = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the elements : ");

        for(i = 0; i < Arr.length; i++)
        {
            Arr[i] = sobj.nextDouble();
        }
    }

    public void Display()
    {
        int i = 0;

        System.out.println("Elements of array are : ");

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i].doubleValue());
        }
    }

    public double Summation()
    {
        int i = 0;
        double sum = 0.0;

        for(i = 0; i < Arr.length; i++)
        {
            sum = sum + Arr[i].doubleValue();
        }

        return sum;
    }


}
class program281
{
    public static void main(String A[])
    {
        int size = 0;
        double iRet = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of elements : ");
        size = sobj.nextInt();

        ArrayX<Float> aobj = new ArrayX<>(size);

        aobj.Accept();
        aobj.Display();

        iRet = aobj.Summation();
        System.out.println("Summation is : "+iRet);

    }
}