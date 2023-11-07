
// import java.util.Map;

public class Recursion1 {

    // public static boolean checkStrictlyIncreasingSorted(int arr[], int i, int j){
    //     if(j == arr.length){
    //         return true;
    //     }

    //     if(arr[i]< arr[j]){
    //         return checkStrictlyIncreasingSorted(arr, i+1, j+1);
    //     }
    //     else{
    //         return false;
    //     }
    // }

    // public static int justgreater(int arr[], int target){
    //     for(int i=0; i< arr.length; i++){
    //         if( target <= arr[i]){
    //             return arr[i];
    //         }
    //     }
    //     return -1;
    // }


    public static int justgreaterBinary(int arr[],int s, int e, int target){
        int m = s+ (e-s)/2;
        if(arr[e]< target){
            return -1;
        }

        if(arr[m]==target){
            return arr[m];
        }

        else if(arr[m]< target){
            s=m+1;
            justgreaterBinary(arr, s, e, target);
        }else{
            e=m-1;
            justgreaterBinary(arr, s, e, target);
        }
        return arr[e];
    }


    public static void  prints(String s){
        int n=s.length();
        String nex = "";
        int count = 0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='x'){
                count++;
            }
            else{
                nex +=s.charAt(i);
            }
        }

        for(int j=0;j<count;j++){
            nex +='x';
        }

        System.out.print(nex);
    }

    // public static int justgreaterBinary(int arr[], int target){
    //     int start = 0;
    //     int end = arr.length -1;

    //     int median = start + (end-start)/2;
    //     if (arr[end] < target) {
    //         return -1;
    //     }

    //     while (start <= end) {
    //         median = start + (end-start)/2;
    //         if(arr[median]==target){
    //             return median;
    //         } else if(arr[median]< target){
    //             start = median + 1;
    //         } else{
    //             end = median - 1;
    //         }
    //     }
    //     return arr[start];
    // }

    public static void main(String []args){

        // int arr[]={1,2,3,4,5,9};
        // boolean result = false;

        // result = checkStrictlyIncreasingSorted(arr, 0, 1);
        // System.out.print(result);
        // int arr2[]={1,2,3,4,5,9};

        // int ans = justgreater(arr2, 6);
        // System.out.print(ans);

        // int[] arr2={1,2,3,4,5,9,11};
        // int result = justgreaterBinary(arr2,0, 6, 6);

        // System.out.print(result);
        String s ="axbdxxm";
        prints(s);
    }
}
