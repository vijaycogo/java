package sorting;
public class InsertionSort {

    public static void insertionSort(int array[]){
        
        for(int i=1; i<array.length; i++) {
            int current = array[i];
            int j = i - 1;
                while(j >= 0 && array[j] > current) {
                    //Keep swapping
                    array[j+1] = array[j];
                    j--;
                }
            array[j+1] = current;
        }
        PrintArray(array);
    }


    public static void main(String [] args){
        System.out.print("Sorted array using Insertion Sort : ");
        int array3[] = {2,4,0,1,7};
        insertionSort(array3);

    }

    public static void PrintArray(int array[]){    
        for(int i=0;i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
    }
    
}

