package com.number;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;


public class NumberTest {

    Number number = new Number();

    @Test
    public void checkPrimeTest(){
        assertTrue(number.checkPrime(7));
        assertFalse(number.checkPrime(10));
        assertFalse(number.checkPrime(-4));
    }

    @Test
    public void checkPalindromeTest(){
        assertTrue(number.checkPalindrome(121));
        assertFalse(number.checkPalindrome(143));
    }

    @Test
    public void checkArmstrongTest(){
        assertTrue(number.checkArmstrong(153));
        assertFalse(number.checkArmstrong(121));
    }

}
