package BinarySearch;


public class RotationCountInRotatedSorted {


    public static int RotationCountPivote(int a[]){
        int s=0;
        int e=a.length-1;
        while(s<e){
            int mid = s+ (e-s)/2;
            if(a[mid]>a[mid+1]){
                return mid;
            }
            if(a[mid]<a[mid-1]){
                return mid-1;
            }
            if(a[s]>a[mid]){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
        }
        return -1;
    }
    public static void main(String []args){
        int a[]={10,12,18,2,3,6};
        int ans = RotationCount(a);
        int ans2=RotationCountPivote(a);
        System.out.println(ans);
        System.out.println(ans2+1);
    }

    public static int RotationCount(int a[]){
        int ans=0;
        for(int i=0;i<a.length-1;i++){
            ans++;
            if(a[i]>a[i+1]){
                break;
            }
        }
        return ans;
    }
    
}
