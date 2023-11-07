package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    
    public static void main(String []strings){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = in.nextInt();
        }

        for(int i = 0; i<a.length;i++ ){
            System.out.print(a[i]);
        }

        // System.out.println(Arrays.toString(a));


    }
}
