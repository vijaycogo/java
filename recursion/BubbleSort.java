import java.util.Arrays;

public class BubbleSort {
    public static void main(String[]strings){
        int[] a1 = {1,12,43,4,5};

        int[] ans1 = bubbleSort(a1.length-1,0,a1);

        System.out.println(Arrays.toString(ans1));



        int[] a = {1,12,3,41,15};
        
        bubbleSort2(a.length-1, 0, a);

        System.out.println(Arrays.toString(a));
    }

    public static int[] bubbleSort(int row, int column, int[]a){
        if(row==0){
            return a;
        }
        if(row>column){
            if(a[column]> a[column+1]){
                int temp = a[column];
                a[column] = a[column+1];
                a[column+1] = temp;
            }
            return bubbleSort(row, column+1, a);
        }
        else{
           return bubbleSort(row-1, 0, a);
        }
    }

    public static void bubbleSort2(int row, int column, int[]a){
        if(row==0){
            return;
        }
        if(row>column){
            if(a[column]> a[column+1]){
                //swap
                int temp = a[column];
                a[column] = a[column+1];
                a[column+1] = temp;
            }
            bubbleSort2(row, column+1,a);
        }
        else{
            bubbleSort(row-1, 0, a);
        }
    }
}
