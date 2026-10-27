// Before and after Removing leading and trailing white spaces as well replace 2 whitespaces with 1 whitespace in string
// print length of string 

class program331
{
    public static void main(String A[])
    {
        String header = "    india   is   my   country    ";

        System.out.println(header.length());        //33

        header = header.trim();      

        System.out.println(header.length());        //25  

        header = header.replaceAll("  "," ");

        System.out.println(header.length());        //22

    }
}