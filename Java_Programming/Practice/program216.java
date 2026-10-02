// Swapping of numbers

class Swap
{
    public void Swapping(int a, int b)
    {
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);

    }

}
class program216
{
    public static void main(String Args[])
    {
        int i = 11;
        int j = 21;

        Swap swap = new Swap();
        swap.Swapping(i,j);
    }
}