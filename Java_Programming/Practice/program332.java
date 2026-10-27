// By removing Leading and trailing as well as replacing multiple white spaces with single whitespace print length of string

class program332
{
    public static void main(String A[])
    {
        String header = "    india   is   my   country    ";

        System.out.println(header.length());

        header = header.trim();      

        System.out.println(header.length());

        header = header.replaceAll("  "," ");

        System.out.println(header.length());

        header = header.replaceAll("  "," ");

        System.out.println(header.length());

    }
}