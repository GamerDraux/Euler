package com.Euler.problems1through10.problem2;

public class Main {
    public static void main (String[] args){
        int fib1 = 1;
        int fib2 = 2;
        int curr;
        int sum = 0;
        do {
            if (fib2 % 2 == 0) {
                sum+=fib2;
            }
            curr = fib1+fib2;
            fib1=fib2;
            fib2=curr;
        } while (fib2<4000000);
        System.out.println("Total sum of all even " +
                "Fibonacci series even numbers is: "+sum);
    }
}
