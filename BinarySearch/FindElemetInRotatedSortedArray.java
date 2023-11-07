package BinarySearch;

public class FindElemetInRotatedSortedArray {

    public static int FindPivote(int a[]){
        int s=0;
        int e=a.length-1;

        while(s<e){
            int mid = s+ (e+s)/2;
            if(  e > mid && a[mid]>a[mid+1]){
                return mid;
            }
            if( mid > s && a[mid]<a[mid-1]){
                return mid-1;
            }
            if(a[s]>=a[mid]){
                e=mid-1;
            }else{
                s=mid+1;
            }
        }
        return -1;
    }

    public static int OrderAgnosticBS(int a[], int target, int s, int e){
        boolean isAgnos = a[s]< a[e];
        while(s<e){
            int mid=s+(e-s)/2;
            if(a[mid]==target){
                return mid;
            }
            if(isAgnos){
                if(a[mid]<target){
                    s=mid+1;

                }else{
                    e=mid-1;
                }
            }else{
                if(a[mid]< target){
                    e=mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return -1;
    }


    public static void main(String []args){
        int a[]={7,8,9,10,14,11,5,4,3,2,1,0,-1};
        int target = 2;
        int pivote = FindPivote(a);

        int ansInFirstHalf = OrderAgnosticBS(a,target, 0, pivote);

        if(ansInFirstHalf!=-1){
            System.out.print(ansInFirstHalf);
        }else{
            int secondhalf = OrderAgnosticBS(a,target, pivote, a.length-1);
            System.out.println(secondhalf);
        }

    }
    
}
