package com.Euler.problems1through10.problem5;

public class IsDivisible {
    public static boolean isDivisible(int number){
        boolean result = true;
        for (int i =1 ; i<21; i++){
            if (number%i!=0){
                result = false;
                break;
            }

        }
        return result;
    }
}
