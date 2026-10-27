// By removing Leading and trailing whitespaces print length of header

class program326
{
    public static void main(String A[])
    {
        String header = "    india is my country    ";

        header = header.trim();      //issue resolved

        System.out.println(header.length());

    }
}