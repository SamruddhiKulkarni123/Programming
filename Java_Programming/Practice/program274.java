// Display elements of array

class ArrayX
{
    private int Arr[];

    public ArrayX(int Arr[])
    {
        this.Arr = Arr;
    }

    public void Display()
    {
        int i = 0;

        for(i = 0; i < Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}
class program274
{
    public static void main(String A[])
    {
        int Brr[] = {10,20,30,40,50};

        ArrayX aobj = new ArrayX(Brr);

        aobj.Display();

    }
}