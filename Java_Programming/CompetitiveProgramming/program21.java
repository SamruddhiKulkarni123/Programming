// Benjamin Bulbs 
// You are given n number of bulbs .They all are switched off .A wired fluction in voltage hits the circuit n times.
//In the first fluction all bulbs are toggled. In the second fluction every second bulb is toggled. In the third fluction every third bubl is toggled
//and so on. You have to find which bulbs will be switched on after n fluctuations.

import java.util.Scanner;

class program21
{
    public static void main(String A[])
    {
        int n = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of bulbs : ");
        n = sobj.nextInt();

        for(int i = 1; i * i <= n; i++)
        {
            System.out.println(i*i);
        }

        
    }
}