// Display elements of array

class ArrayX
{
    private double Arr[];

    public ArrayX(double Arr[])
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
class program275
{
    public static void main(String A[])
    {
        double Brr[] = {10.2,20.2,30.2,40.2,50.2};

        ArrayX aobj = new ArrayX(Brr);

        aobj.Display();

        

    }
}