// By removing Leading and trailing whitespaces print length of header

class program325
{
    public static void main(String A[])
    {
        String header = "    india is my country    ";

        header.trim();      //issue

        System.out.println(header.length());

    }
}