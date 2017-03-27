/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elevens;

/**
 *
 * @author brian
 */
import java.math.BigInteger;

public class Elevens
{
    private static boolean isPalindrome(BigInteger number)
    {
        boolean pal = true;
        String checkMe = number.toString();
        for (int i=0; i<checkMe.length()/2 && pal; i++)
        {
            if (checkMe.charAt(i) != checkMe.charAt(checkMe.length() - i - 1))
                pal = false;
        }
        return pal;
    }

    private static void elevenPals(BigInteger ones, BigInteger powersOfTen)
    {
        BigInteger result = ones.multiply(ones);
        System.out.print(ones + " * " + ones + " is " + result);
        boolean pal = isPalindrome(result);
        System.out.println(" - and it is " + (pal?"":"NOT ") + "a PALINDROME");

        // IMPLEMENT RECURSIVE CALL HERE
        // UTILIZE CONSTANTS FROM BigInteger CLASS
        if(pal)
        {
            elevenPals( ones.add( powersOfTen.multiply( BigInteger.TEN)),
                                  powersOfTen.multiply( BigInteger.TEN));
        }
    }

    public static void main(String args[])
    {
        BigInteger ones = new BigInteger("1");
        BigInteger powersOfTen = new BigInteger("1");

        elevenPals(ones, powersOfTen);
    }
}



