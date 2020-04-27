package com.Euler.problems1through10.problem4;

public class Main {
    public static void main(String [] args){
        int num1;
        int num2;
        int largest=0;
        for (num1=100; num1<1000; num1++){
            for (num2=100; num2<1000; num2++){
                if (IsPalindrome.isPalindrome(num1*num2)){
                   if (largest<num1*num2){
                       largest=num1*num2;
                   }
                }
            }
        }
        System.out.println("The largest palindrome that " +
                "is the product of 2 three-digit numbers " +
                "is: "+largest);
    }
}
