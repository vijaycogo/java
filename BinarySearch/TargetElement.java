package BinarySearch;

public class TargetElement {
    
    public static int FindTarget(int a[], int target, int s, int e){
        int mid = s+ (e-s)/2;
        while(s<=e){
            mid=s+(e-s)/2;
            if(a[mid]==target){
                System.out.println("element is found");
                return mid;

            }
            else if (a[mid]<target){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return -1;
    }
    public static void main(String [] args){
        int a[]={2,4,6,8, 99};
        System.out.println(FindTarget(a,8, 0, 4));
    }
}
