package Array;

import java.lang.annotation.Target;

public class Searchin2d {
    public static void main(String []strings){
        int[][] array ={
            {1,3,4},
            {5,6,8},
            {9,0,11,16}
        };

        SearchElement(array, 16);
    }
    
    static void SearchElement(int[][] array, int target){
        for(int row=0;row<array.length; row++){
            for(int column=0;column< array[row].length; column++){
                if(array[row][column] == target){
                    System.out.println(target + " Element found at index " + row + column );
                    return;
                }
            }
        }
        System.out.println("Element does not exit");
    }
    
}
