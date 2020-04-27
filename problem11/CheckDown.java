public class CheckDown {
    public static int checkdown(int[][] grid){
        int biggest=0;
        int test = 0;
        for (int i= 0; i<20; i++){
            for (int j= 0; j<17; j++){
                test=
                        grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
                if (test>biggest){biggest=test;}
            }
        }
        return biggest;
    }
}
