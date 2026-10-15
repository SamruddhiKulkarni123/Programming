// Display elements of array as well as add them

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

    public double Summation()
    {
        int i = 0;
        double sum = 0.0;

        for(i = 0; i < Arr.length; i++)
        {
            sum = sum + Arr[i];
        }

        return sum;
    }
}
class program276
{
    public static void main(String A[])
    {
        double Brr[] = {10.2,20.2,30.2,40.2,50.2};
    
        ArrayX aobj = new ArrayX(Brr);
        aobj.Display();
        System.out.println("Summation is : "+aobj.Summation());
        

    }
}