package com.Euler.problem11;

public class CheckSlash {
    public static int checkSlash(int[][] grid){
        int biggest=0;
        int test;
        for (int i= 3; i<20; i++){
            for (int j= 0; j<17; j++){
                test=
                        grid[i][j]*grid[i-1][j+1]*grid[i-2][j+2]*grid[i-3][j+3];
                if (test>biggest){biggest=test;}
            }
        }
        return biggest;
    }
}
