package BinarySearch;

public class PioteNumber {

    public static int FindPiovteNumber(int a[]){
        int s=0;
        int e=a.length-1;
        while(s<=e){
            int mid = s+(e-s)/2;
            if( e > mid && a[mid]>a[mid+1]){

                // [1,5,7,6,2]
                return mid;
            }
            if( mid > s && a[mid] < a[mid-1]){
                // [7,8,6,4,2]
                return mid-1;
            }
            if(a[s] >= a[mid]){
                // [7,8,6,4,2,]
                e=mid-1;
            }
            else {
                // [3,4, 5,6,2]
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int a[]={7,8,9,10,14,11,5,4,3,2,1,0,-1};
        int pivote = FindPiovteNumber(a);
        System.out.println(a[pivote]);

    }
    
}
