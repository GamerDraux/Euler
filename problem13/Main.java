package com.Euler.problem13;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> resultArrayList = new ArrayList<>();

        int digitCounter=0;
        for (int j=1; j<51; j++) {
            for (int i = 0; i < 100; i++) {
                digitCounter += Integer.parseInt(String.valueOf(Grid.numberArrClone[i].charAt(Grid.numberArrClone[i].length() - j)));
            }
            resultArrayList.add(0,
                    digitCounter % 10);
            digitCounter = digitCounter / 10;

        }
        do {
            resultArrayList.add(0, digitCounter%10);
            digitCounter=digitCounter/10;
        } while (digitCounter!=0);
       StringBuilder resultString = new StringBuilder();
       Object[] resultArray = resultArrayList.toArray();
       for (int i=0; i<resultArrayList.size(); i++){
           resultString.append(resultArray[i]);
       }

       System.out.println("Total sum of all 100 numbers " +
                "is: "+resultString);
       System.out.println("The first 10 " +
                       "digits are: " + resultArrayList.subList(0,
               10));



    }
}
