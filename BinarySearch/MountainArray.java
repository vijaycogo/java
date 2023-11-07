package BinarySearch;

public class MountainArray {
    public static void printMountain(int a[]){
        int s=0;
        int e=a.length-1;

        while(s<e){
            int mid=s+(e-s)/2;
            if(a[mid]<a[mid+1]){
                s=mid+1;
            }else{
                e=mid;
            }
        }
        System.out.println(a[s]);
        return;


        // while(s<e){
        //     int mid=s+(e-s)/2;
        //     if(a[mid]>a[mid+1]&&a[mid]>a[mid-1]){
        //         System.out.println(a[mid]);
        //         return;
        //     }
        //     if(a[mid]<a[mid+1]){
        //         s=mid+1;
        //     }else if(a[mid]>a[mid+1]){
        //         e=mid;
        //     }
        // }

    }
    public static void main(String [] args){
        int a[]={1,0,5,4,2,-2, -5,-9};
        printMountain(a);
    }
    
}
