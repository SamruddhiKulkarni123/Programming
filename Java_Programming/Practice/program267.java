// Addition using generics

class Arithmetic<T extends Number>
{
    private T No1;
    private T No2;

    public Arithmetic(T No1, T No2)
    {
        this.No1 = No1;
        this.No2 = No2;
    }

    public double Addition()
    {
        return No1.doubleValue() + No2.doubleValue();
    } 

}
class program267 
{
    public static void main(String A[])
    {
        Arithmetic <Integer> aobj1 = new Arithmetic<>(10,11);
        Arithmetic <Float> aobj2 = new Arithmetic<>(10.2f,11.3f);

        System.out.println(aobj1.Addition());
        System.out.println(aobj2.Addition());
    }

}
