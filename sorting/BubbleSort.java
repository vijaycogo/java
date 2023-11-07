package sorting;

public class BubbleSort {

    public static void bubbleSort(int array[], int n){
        boolean flag = true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(array[j]>array[j+1]){
                    flag = false;
                    // System.out.println("check for optimization");
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
            if(flag){
                PrintArray(array);
                return;
            }
        }
        PrintArray(array);
    }

    public static void main(String []args){
        System.out.print("Sorted array using Bubble Sort : ");
        int array[] = {2,4,5,1,7};
        // int array[] = {2,4,5,6,7};
        bubbleSort(array, 5);

    }

    // print function
    public static void PrintArray(int array[]){    
        for(int i=0;i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
    
}
