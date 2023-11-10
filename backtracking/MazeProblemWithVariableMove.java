package backtracking;
import java.util.*;
public class MazeProblemWithVariableMove {
    public static void main(String[] args) {
        int count  = findSteps(5,3);
        System.out.println(count);

        count  =findStepsiteration(5,3);
        System.out.println(count);

        ArrayList<String> path = findStepsWithPath(5, 3, "");

        System.out.println(path);
        Collections.reverse(path);//for reverse
        System.out.println(path);
        // for (String step : path) {
        //     System.out.println(step);
        // }
    }

    public static ArrayList<String> findStepsWithPath(int row, int column, String ans) {
        ArrayList<String> path = new ArrayList<>();

        if (row == 1 && column == 1) {
            // Already at the destination
            path.add("(" + row + ", " + column + ")");
        } else if (row == column) {
            // Reached a state where row and column are equal
            path.add("(" + row + ", " + column + ")");
        } else if (row > column) {
            path.add("(" + row + ", " + column + ")");
            path.addAll(findStepsWithPath(row - column, column, ans));
        } else {
            path.add("(" + row + ", " + column + ")");
            path.addAll(findStepsWithPath(row, column - row, ans));
        }

        return path;
    }
    
    public static int findSteps(int row, int column) {
        if (row == 1 && column == 1) {
            return 0;  // Already at the destination
        } else if (row == column) {
            return 1;  // Reached a state where row and column are equal
        } else if (row > column) {
            return 1 + findSteps(row - column, column);
        } else {
            return 1 + findSteps(row, column - row);
        }
    }   

    public static int findStepsiteration(int row, int column) {
        int count = 0;

        while (row > 1 || column > 1) {
            if (column > row) {
                column -= row;
            } else if (row > column) {
                row -= column;
            } else {
                // Solution is impossible
                return 0;
            }

            count++;
        }

        return count;
    } 
}
