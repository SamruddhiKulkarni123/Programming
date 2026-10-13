// Accept two numbers from user and return maximum number

class NumberX
{
    public float Maximum(float No1, float No2)
    {
        if(No1 > No2)
        {
            return No1;
        }
        else 
        {
            return No2;
        }
    }
}
class program269
{
    public static void main(String A[])
    {
        NumberX nobj = new NumberX();

        System.out.println(nobj.Maximum(14.89f,14.32f));

    }
}