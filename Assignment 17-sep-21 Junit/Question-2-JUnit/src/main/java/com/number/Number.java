package com.number;

import static java.lang.Math.sqrt;

public class Number {
    private Integer num;

    public Boolean checkPrime(Integer n){
        if (n <= 1)
            return false;

        // Check from 2 to square root of n
        for (int i = 2; i <= sqrt(n); i++)
            if (n % i == 0)
                return false;

        return true;

    }

    public Boolean checkPalindrome(Integer x){
        String str=x.toString();
        int i = 0, j = str.length() - 1;

        // While there are characters to compare
        while (i < j) {

            // If there is a mismatch
            if (str.charAt(i) != str.charAt(j))
                return false;

            // Increment first pointer and
            // decrement the other
            i++;
            j--;
        }

        // Given string is a palindrome
        return true;
    }

    public Boolean checkArmstrong(Integer number){
        int  originalNumber, remainder, result = 0;

        originalNumber = number;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == number)
           return true;
        else
            return false;

    }
}
