// Convert decimal number into octal and hexadecimal

class program217
{
    public static void main(String A[])
    {
        int No = 97;

        String octal = Integer.toOctalString(No);

        String hex = Integer.toHexString(No);

        System.out.println("Decimal : "+No);
        System.out.println("Octal : "+octal);
        System.out.println("Hexadecimal : "+hex);

    }
}