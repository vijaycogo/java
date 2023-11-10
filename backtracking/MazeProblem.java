package backtracking;

import java.util.ArrayList;

public class MazeProblem {
    public static void main(String[] args) {
        // int count  = returncount(3,3);
        // System.out.println(count);
        
        // printpath("",3,3);
        
        // ArrayList<String> path = returnpath("",3,3);
        // System.out.println(path);

        int digonalcount  = returncountwithdiaogonal(3,3);
        System.out.println(digonalcount);

        ArrayList<String> digonalpath = returndiaogonalpath("",3,3);
        System.out.println(digonalpath);

    }
    public static int returncount(int row, int column) {
        if(row==1||column==1){
            return 1;
        }
        int right = returncount(row, column-1);
        int down = returncount(row-1, column);
        return right + down;
    }

    public static void printpath(String ans, int row, int column) {
        if(row==1 && column ==1){
            System.out.println(ans);
            return ;
        }
        if(column > 1){
            printpath(ans + "R", row, column-1);
        }
        if(row > 1){
            printpath(ans + "D", row-1, column);
        }
    }

    public static ArrayList<String> returnpath(String ans, int row, int column){
        if(row==1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(column > 1){
            list.addAll(returnpath(ans + "R", row,column-1));
        }

        if(row  > 1){
            list.addAll(returnpath(ans + "R", row-1,column));
        }
        return list;
    }

    public static int returncountwithdiaogonal(int row, int column) {
        if(row==1 && column==1){
            return 1;
        }
        int diogonal = 0;
        int horizontal = 0;
        int vertical = 0;
        if(column > 1){
            horizontal = returncountwithdiaogonal(row, column-1);
        }
        if(row  > 1){
            vertical = returncountwithdiaogonal(row-1, column);
        }
        if (row > 1 && column >1){
            diogonal = returncountwithdiaogonal(row-1, column-1);
        }
        return horizontal + vertical + diogonal;
    }

    public static ArrayList<String> returndiaogonalpath(String ans, int row, int column){
        
        if(row == 1 && column == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();

        if(row  > 1 && column > 1){
            list.addAll(returndiaogonalpath(ans + 'D', row - 1, column - 1));
        }

        if(row  > 1){
            list.addAll(returndiaogonalpath(ans + 'V', row - 1,column));
        }

        if(column > 1){
            list.addAll(returndiaogonalpath(ans + 'H', row, column-1));
        }
        return list;
    }


}
