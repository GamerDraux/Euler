import java.awt.*;
import java.util.zip.Checksum;

public class Main {
    public static void main (String[] args){
        int[][] arrGrid = GetGrid.getGrid();
        int result = 0;
       if (CheckDown.checkdown(arrGrid)>result){result=
               CheckDown.checkdown(arrGrid);}
       if (CheckRight.checkRight(arrGrid)>result){result=
               CheckRight.checkRight(arrGrid);}
       if (CheckSlash.checkSlash(arrGrid)>result){result
               = CheckSlash.checkSlash(arrGrid);}
       if (CheckBackslash.checkBackslash(arrGrid)>result){result=CheckBackslash.checkBackslash(arrGrid);}
        System.out.println("The greatest product is: "+result);


    }
}
