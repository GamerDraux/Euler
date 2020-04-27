public class CheckRight {
    public static int checkRight(int[][] grid){
        int biggest=0;
        int test = 0;
        for (int i= 0; i<17; i++){
            for (int j= 0; j<20; j++){
                test=
                        grid[i][j]*grid[i+1][j]*grid[i+2][j]*grid[i+3][j];
                if (test>biggest){biggest=test;}
            }
        }
        return biggest;
    }
}
