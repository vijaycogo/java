package TicTacToe;
import java.util.Arrays;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];

        for (char[] row : board) {
            Arrays.fill(row, ' ');
        }

        Scanner input = new Scanner(System.in);
        char player = 'X';
        boolean gameOver = false;

        while(!gameOver) {
            printBoard(board);

            System.out.println("Your turn, Player " + player + " !!");
            System.out.print("Enter row: ");
            int row = input.nextInt();
            System.out.print("Enter column: ");
            int column = input.nextInt();

            if (row > board.length || column > board.length || board[row][column] != ' '){
                System.out.println("INVALID MOVE!!");
            } else {
                board[row][column] = player;
                gameOver = haveWon(board, player, row, column);

                if (gameOver) {
                    System.out.println();
                    System.out.println("🎉🎉🎉 Player " + player + " has won!! 🎉🎉🎉");
                } else {
                    player = (player == 'X' ? 'O' : 'X');
                }
            }
  
        }
        printBoard(board);
        input.close();
    }

    private static void printBoard(char[][] board) {
        System.out.println("   0 1 2");
        System.out.println("  +-+-+-+");
        for (int i = 0; i < board.length; i++) {
            System.out.print((i) + " |");
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    System.out.print("-|");
                } else {
                    System.out.print(board[i][j] + "|");
                }
            }
            System.out.print(" " + i);
            System.out.println();
            System.out.println("  +-+-+-+");
        }
        System.out.println("   0 1 2");
    }
    
    

    private static boolean haveWon(char[][] board, char player, int row, int column) {
        if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
            return true;
        }

        if (board[0][column] == player && board[1][column] == player && board[2][column] == player) {
            return true;
        }

        if (row == column) {
            if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
                return true;
            }
        }

        if (row + column == 2) {
            if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
                return true;
            }
        }

        return false;
    }
    
}
