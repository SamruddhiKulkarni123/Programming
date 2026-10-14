// Accept three numbers from user and return maximum number

class NumberX<T extends Number>
{
    private T No1;
    private T No2;
    private T No3;

    public NumberX(T No1, T No2, T No3)
    {
        this.No1 = No1;
        this.No2 = No2;
        this.No3 = No3;
    }

    public double Maximum()
    {
        double Ans;

        if(No1.doubleValue() > No2.doubleValue() && No1.doubleValue() > No3.doubleValue())
        {
            Ans = No1.doubleValue();
        }
        else if(No2.doubleValue() > No1.doubleValue() && No2.doubleValue() > No3.doubleValue())
        {
            Ans = No2.doubleValue();
        }
        else 
        {
            Ans = No3.doubleValue();
        }

        return Ans;
    }
}
class program273
{
    public static void main(String A[])
    {
        NumberX<Float> nobj1 = new NumberX<>(14.89f,14.32f,17.34f);
        NumberX<Integer> nobj2 = new NumberX<>(14,33,12);
        NumberX<Double> nobj3 = new NumberX<>(56.78,33.12,12.15);

        System.out.println(nobj1.Maximum());
        System.out.println(nobj2.Maximum());
        System.out.println(nobj3.Maximum());

    }
}