package com.Euler.problem14;

public class RunCollatzSequence {
    public static Long runCollatzSequence(Long n){
        Long sequenceLength=1L;
        do {
            if (n%2==0){
                n= WorkEven.workEven(n);
            } else {
                n= WorkOdd.workOdd(n);
            }
            System.out.print(n+" ");
            sequenceLength++;

        } while (n !=1);
        return sequenceLength;
    }
}
