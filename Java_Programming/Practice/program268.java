// Accept two numbers from user and return maximum number

class NumberX
{
    public int Maximum(int No1, int No2)
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
class program268
{
    public static void main(String A[])
    {
        NumberX nobj = new NumberX();

        System.out.println(nobj.Maximum(14,34));

    }
}