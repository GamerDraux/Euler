package com.Euler.problem12;

public class Main {
    public static void main (String[] args){
        int solution = 0;
        System.out.println("Searching for the first " +
                "triangle number with more than 500 " +
                "divisors...");
        do {
            solution ++;
            System.out.println("Triangle number: "+CreateTriangleNumber.createTriangleNumber(solution)+"  Divisors: "+FindDivisors.findDivisors(CreateTriangleNumber.createTriangleNumber(solution)));
        } while (FindDivisors.findDivisors(CreateTriangleNumber.createTriangleNumber(solution))<=251);

        System.out.println("The first Triangle number " +
                "that has over 500 divisors is: "+CreateTriangleNumber.createTriangleNumber(solution));
    }
}
