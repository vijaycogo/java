package BinarySearch;

public class SearchInMountainArray {

    public static int FindPeakElement(int a[]){
        int s=0;
        int e=a.length-1;
        while(s<e){
            int mid = s+(e-s)/2;

            if(a[mid]<a[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }

        }
        return s;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }



    public static void FindElement(int a[], int target){
        int peakIndex =FindPeakElement(a);

        int targetElementInFirstHalf = orderAgnosticBS(a, target,0, peakIndex);

        if(targetElementInFirstHalf!=-1){
            System.out.print(targetElementInFirstHalf);
        }else{
            int targetElementInSecondHalf = orderAgnosticBS(a, target,peakIndex +1, a.length-1);
            System.out.print(targetElementInSecondHalf);
        }
    }

    public static void main(String []args){
        int a[]={1,2,3,4,8,7,6,5,2,0};
        FindElement(a, 5);
    }
    
}
