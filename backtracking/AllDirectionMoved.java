package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class AllDirectionMoved {
    public static void main(String[] args) {
        boolean[][] matrix = {{true, true, true},{true, true, true}, {true, true, true}};
        allDirectionPath("", 0,0,matrix);
        ArrayList<String> result= returnAllDirectionPath("", 0,0,matrix);
        System.out.println(result);

        int[][] path= new int[matrix.length][matrix[0].length];

        allDirectionPathPrint("", 0,0,matrix,path,1);
        
    }

    public static void allDirectionPathPrint(String ans, int row, int column, boolean[][] matrix, int[][] path, int step){

        if(row == matrix.length -1 && column == matrix[0].length -1){
            path[row][column] = step;
            System.out.println(ans);
            for(int[] num : path){
                System.out.println(Arrays.toString(num));
            }
            System.out.println();
            return;
        }

        if(matrix[row][column]==false){
            return;
        }

        matrix[row][column] = false;
        path[row][column] = step;
        
        if(row > 0){
            allDirectionPathPrint(ans + "U", row - 1, column, matrix, path, step + 1);
        }

        if(row < matrix.length - 1){
            allDirectionPathPrint(ans + "D", row + 1, column, matrix, path, step + 1);
        }

        if(column > 0){
            allDirectionPathPrint(ans + "L", row, column - 1, matrix, path, step + 1);
        }
        if(column < matrix[row].length - 1){
            allDirectionPathPrint(ans + "R", row, column + 1, matrix, path, step + 1);
        }
        matrix[row][column] = true;
        path[row][column] = 0;
    }

    public static ArrayList<String> returnAllDirectionPath(String ans, int row, int column, boolean[][] matrix){

        if(row == matrix.length -1 && column == matrix[0].length -1){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if(matrix[row][column]==false){
            return list;
        }

        matrix[row][column] = false;
        
        if(row > 0){
            list.addAll(returnAllDirectionPath(ans + "U", row - 1, column, matrix));
        }

        if(row < matrix.length - 1){
            list.addAll(returnAllDirectionPath(ans + "D", row + 1, column, matrix));
        }

        if(column > 0){
            list.addAll(returnAllDirectionPath(ans + "L", row, column - 1, matrix));
        }
        if(column < matrix[row].length - 1){
            list.addAll(returnAllDirectionPath(ans + "R", row, column + 1, matrix));
        }
        matrix[row][column] = true;
        return list;
    }

    public static void allDirectionPath(String ans, int row, int column, boolean[][] matrix){

        if(row == matrix.length -1 && column == matrix[0].length -1){
            System.out.println(ans);
            return;
        }

        if(matrix[row][column]==false){
            return;
        }

        matrix[row][column] = false;
        
        if(row > 0){
            allDirectionPath(ans + "U", row - 1, column, matrix);
        }

        if(row < matrix.length - 1){
            allDirectionPath(ans + "D", row + 1, column, matrix);
        }

        if(column > 0){
            allDirectionPath(ans + "L", row, column - 1, matrix);
        }
        if(column < matrix[row].length - 1){
            allDirectionPath(ans + "R", row, column + 1, matrix);
        }
        matrix[row][column] = true;;
    }
}

