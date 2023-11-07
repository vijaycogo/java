package BinarySearch;

public class CeilingNumber {
    public static void FindCeilingNumber(int a[], int target){

        int s =0;
        int e = a.length-1;
        int mid = s+(e-s)/2;
        if(target> a[e]){
            System.out.println("target is greater than array ");
        }
        while(s<=e){
            mid = s+ (e-s)/2;
            if(a[mid]==target){
                System.out.println("ajsdhk");
                return;
            }
            if(a[mid]<target){
                s = mid+1;
            }
            else{
                e=mid-1;
            }
        }
        System.out.println(a[s]);
    }

    public static void main(String []args){
        
        int a[]={1,2,3,4,6,77,88,99,100,343};
        FindCeilingNumber(a, 99);
    }
    
}
