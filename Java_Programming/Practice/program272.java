// Accept two numbers from user and return maximum number

class NumberX<T extends Number>
{
    private T No1;
    private T No2;

    public NumberX(T No1, T No2)
    {
        this.No1 = No1;
        this.No2 = No2;
    }

    public double Maximum()
    {
        double Ans;

        if(No1.doubleValue() > No2.doubleValue())
        {
            Ans = No1.doubleValue();
        }
        else 
        {
            Ans = No2.doubleValue();
        }

        return Ans;
    }
}
class program272
{
    public static void main(String A[])
    {
        NumberX<Float> nobj1 = new NumberX<>(14.89f,14.32f);
        NumberX<Integer> nobj2 = new NumberX<>(14,33);

        System.out.println(nobj1.Maximum());
        System.out.println(nobj2.Maximum());

    }
}