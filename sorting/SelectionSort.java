package sorting;

public class SelectionSort {

    public static void selectionSort(int array[], int n){
        for(int i=0;i<n-1;i++){
            int smallest = i;
            for(int j=i+1;j<n;j++){
                if(array[smallest]> array [j])
                smallest = j;
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }
        PrintArray(array);
    }

    public static void main(String []args){
        // int array[] = new int [3];
        System.out.print("Sorted array using selectionSort : ");
        int array[] = {2,4,5,1,7};
        selectionSort(array, 5);

    }

    // print function
    public static void PrintArray(int array[]){    
        for(int i=0;i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }

    
}
