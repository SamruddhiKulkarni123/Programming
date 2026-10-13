// Accept two numbers from user and return maximum number

class NumberX
{
    public float Maximum(float No1, float No2)
    {
        float Ans;

        if(No1 > No2)
        {
            Ans = No1;
        }
        else 
        {
            Ans = No2;
        }

        return Ans;
    }
}
class program270
{
    public static void main(String A[])
    {
        NumberX nobj = new NumberX();

        System.out.println(nobj.Maximum(14.89f,14.32f));

    }
}