package backtracking;

public class Nqueen {
    public static void main(String[] args) {
        int n=4;
        //how many way are there to place n queen on maze so that no
        //  queen are in same row or column and no adcent queen are in diagonal 
        boolean[][] board = new boolean[n][n];
        System.out.println(numberofWay(0, board));
    }

    private static int numberofWay(int row , boolean[][] board) {
        if(row == board.length){
            printboard(board);
            return 1;
        } 
        
        int count =0;
        for(int column =0; column < board.length; column++){
            if(isSafe(board, row, column)){
                board[row][column]=true;
                count +=numberofWay(row + 1, board);
                board[row][column]=false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int column) {

        for(int i=0;i<row;i++){
            if(board[i][column]){
                return false;
            }
        }

        int minRowColumn = Math.min(row, column);
        for(int i=1;i<=minRowColumn;i++){
            if(board[row - i][column - i]){
                return false;
            }
        }
        
        int minRowColumnRight = Math.min(row, board.length - column -1);
        for(int i=1;i<=minRowColumnRight;i++){
            if(board[row - i][column + i]){
                return false;
            }
        }

        return true;
    }

    private static void printboard(boolean[][] board) {
        for(boolean[] row : board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
