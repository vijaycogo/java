import java.util.Arrays;
// import java.util.Scanner;

public class MergeSort {
    
    public static void main(String[]strings){

        int[] a = {4,1,6,3,5};
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int n = sc.nextInt();
        // int[]a = new int[n];
        // for(int i =0;i<n;i++){
        //     a[i] = sc.nextInt();
        //     //  a[i] = v;
        // }
        // sc.close();
        System.out.println(Arrays.toString(mergeSort(a)));

        System.out.println(Arrays.toString(a));
    }
    public static int[] mergeSort(int[]a){

        if(a.length==1){
            return a;
        }
        int mid = (a.length)/2;
        //arrays.copyOfRange make a new array from original with
        //  from index 0 to end parameter
        int[] left = mergeSort(Arrays.copyOfRange(a, 0, mid));
        int []right = mergeSort(Arrays.copyOfRange(a, mid, a.length));

        return mergearray(left,right);
    }

    private static int[] mergearray(int[] first, int[] second) {
        int i=0;
        int j=0;
        int[] tempans = new int[first.length + second.length];
        int k=0;
        while(i<first.length && j < second.length){
            if(first[i]<second[j]){
                tempans[k] = first[i];
                i++;
                k++;
            }
            else{
                tempans[k]= second[j];
                j++;
                k++;
            }
        }


        while(first.length>i){
            tempans[k] = first[i];
            i++;
            k++;
        }

        while(second.length>j){
            tempans[k]= second[j];
            j++;
            k++;
        }
        return tempans;
    }
}
