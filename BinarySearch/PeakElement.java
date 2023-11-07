package BinarySearch;

public class PeakElement {
    public static void main(String []strings){
        int []a = {4,6,7,8,2,1};
        int ans = FindPeakElement(a);
        System.out.println(a[ans]);
    }


    public static int FindPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid+1]) {
                // you are in dec part of array
                // this may be the ans, but look at left
                // this is why end != mid - 1
                end = mid;
            } else {
                // you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start; // or return end as both are =
    }

    // public static int FindPeakElement(int a[]){
    //     int s = 0;
    //     int e = a.length-1;
    //     int index = 0;
    //     while(s<e){
    //         index = index +1;
    //         int mid = s+ (e-s)/2;
    //         System.out.println(index +" start "+ s+  " mid value  "+ a[mid]+  " end value " + e);

    //         if(a[mid]> a[mid+1]){
    //             e = mid;
    //         }
    //         else{
    //             // a[mid]< a[mid+1]
    //             s= mid+1;
    //         }
    //     }
    //     return s;
    // }
    
}
