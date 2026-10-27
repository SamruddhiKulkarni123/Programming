// Before and after removing Leading and trailing whitespaces print length of header

class program327
{
    public static void main(String A[])
    {
        String header = "    india  is  my  country    ";

        System.out.println(header.length());

        header = header.trim();      

        System.out.println(header.length());

    }
}