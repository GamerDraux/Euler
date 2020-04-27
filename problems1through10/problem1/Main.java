package com.Euler.problems1through10.problem1;

public class Main {

    public static void main(String[] args) {
        int sum=0;
	    for (int i=0; i<1000; i++){
	        if (isMultiple.ofFive(i)||isMultiple.ofThree(i)){
	            sum+=i;
            }
        }
	    System.out.println("The total sum of all " +
                "multiples of 3 and 5 below 1000 is: "+ sum);
    }
}
