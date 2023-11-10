package backtracking;

import java.util.ArrayList;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] matrix = {{false, false, false},{false, true, false}, {false, false, false}};
        // boolean[][] matrix = {{false, false, false,false},{false, true, false,false},{true, false, false,false},{false, false, false,false}};

        int countpath = returncountwithobstacles(0,0, matrix);
        System.out.println(countpath);

        returncountwithobstacles(" ",0,0, matrix);
        ArrayList<String> path = pathwithobsetecle("", 0, 0, matrix);
        System.out.println(path);
    }



    public static int returncountwithobstacles(int row, int column, boolean[][] matrix) {
        if(row == matrix.length - 1 && column == matrix[0].length - 1){
            return 1;
        }
        if(matrix[row][column]==true){
            return 0;
        }
        int down = 0;
        int right =0;
        if(row < matrix.length - 1){
            down = returncountwithobstacles(row + 1, column, matrix);
            
        }
        if(column < matrix[row].length - 1){
            right  = returncountwithobstacles(row, column + 1, matrix);
        }
        return right + down;
    }


    public static void returncountwithobstacles(String ans, int row, int column, boolean[][] matrix) {
        if(row == matrix.length - 1 && column == matrix[0].length - 1){
            System.out.println(ans);
            return;
        }

        
        if(matrix[row][column]==true){
            return ;
        }

        if(row < matrix.length - 1){
            returncountwithobstacles(ans + 'V', row + 1, column, matrix);
        }

        if(column < matrix[row].length - 1){
            returncountwithobstacles(ans + 'H',row, column + 1, matrix);
        }
    }



    private static ArrayList<String> pathwithobsetecle(String ans, int row, int column, boolean[][] matrix) {
        
        if(row == matrix.length - 1 && column == matrix[0].length - 1){
            ArrayList<String>list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String>list = new ArrayList<>();

        if(matrix[row][column]==true){
            return list;
        }

        // if(row < matrix.length - 1 && column == matrix[row].length - 1 ){
        //     list.addAll(pathwithobsetecle(ans + 'D', row + 1, column + 1, matrix));
        // }

        if(row < matrix.length - 1){
            list.addAll(pathwithobsetecle(ans + 'V', row + 1, column, matrix));
        }

        if(column < matrix[row].length - 1){
            list.addAll(pathwithobsetecle(ans + 'H', row, column + 1, matrix));
        }
        return list;
    }

    
}
