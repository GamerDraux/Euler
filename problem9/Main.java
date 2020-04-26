package com.Euler.problem9;

public class Main {
    public static void main(String[] args){
        int aa=0;
        int bb=0;
        int cc=0;
            for (int a = 1; a<1000; a++) {
                for (int b = a; b < 1000; b++) {
                    for (int c = b; c < 1000; c++) {
                                if (a+b+c==1000&&IsPythagoreanTriplet.isPythagoreanTriplet(a, b, c)) {
                                   aa= a;
                                   bb= b;
                                   cc= c;
                        }
                    }
                }
            }
            System.out.println("The Pythagorean triplet " +
                    "that where a+b+c=1000 is:"+aa+"+"+bb+
                    "+"+cc);
            int product = aa*bb*cc;
            System.out.println("The product of that " +
                    "triplet is: "+product);
    }
}
