// Display elements of array as well as add them

class ArrayX <T extends Number>
{
    private T Arr[];

    public ArrayX(T Arr[])
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
            sum = sum + Arr[i].doubleValue();
        }

        return sum;
    }
}
class program277
{
    public static void main(String A[])
    {
        Double Brr[] = {10.2,20.2,30.2,40.2,50.2};
        Integer Crr[] = {10,20,30,40,50};

        ArrayX<Double> aobj1 = new ArrayX<>(Brr);
        aobj1.Display();
        System.out.println("Summation is : "+aobj1.Summation());

        ArrayX<Integer> aobj2 = new ArrayX<>(Crr);
        aobj2.Display();
        System.out.println("Summation is : "+aobj2.Summation());

        

    }
}