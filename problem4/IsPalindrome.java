package com.Euler.problem4;

import java.util.Arrays;

public class IsPalindrome {
    public static boolean isPalindrome(Integer number){
        String strNumber = Integer.toString(number);
        char[] arrNumber = strNumber.toCharArray();
        char[] reversedArr = new char[arrNumber.length];
        for (int i =0; i<arrNumber.length; i++){
            reversedArr[arrNumber.length-1-i]=arrNumber[i];
        }
        return Arrays.equals(arrNumber, reversedArr);
    }
}
