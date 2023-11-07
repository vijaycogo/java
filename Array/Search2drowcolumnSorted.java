package Array;

import java.util.Arrays;

public class Search2drowcolumnSorted {
    
    public static void main(String[]strings){

        int [][]matrix= {
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,47},
            {33,34,38,49}
        };
        boolean ans = search(matrix, 4, 4, 47);
        if(ans){
            System.out.println("target is found");
        }else{
            System.out.println("target is not found");
        }
    }

    public static boolean search(int matrix[][], int n, int m, int x) 
	{  
	    // code here 
	    int r = 0;
	    int c = matrix.length -1;
	    while(r<n && c > 0 ){
	        if(matrix[r][c] == x){
	           System.out.println(Arrays.toString(new int[]{r,c}));
	            return true;
	        }
	        else if(matrix[r][c] < x){
	            r++;
	            
	        }
	        else{
	            c--;
	        }
	    }
	    return false;
	} 
}
