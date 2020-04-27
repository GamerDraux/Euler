package com.Euler.problems1through10.problem5;

public class Main {
    public static void main(String[] args){
        int smallest = 0;
        do {
            smallest +=1;
        } while (!IsDivisible.isDivisible(smallest));
        System.out.println("The smallest number evenly " +
                "divisible by the numbers 1 to 20 is: "+smallest);
    }
}
