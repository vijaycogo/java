package BinarySearch;

public class Find12index {
    public static void main(String []strings){
        int[] a = {5,7,7,8,8,8,8,8,8,8,10};
        Find_first_Last_Index_of_Target_Element(a,8);
    }

    // static void Find_first_Last_Index_of_Target_Element(int[]a, int target){
    //     int findex =-1;
    //     int sindex =-1;
    //     for(int i=0;i<a.length;i++){
    //         if(a[i]==target&& findex==-1){
    //             findex=i;
    //         }
    //         if(a[i]==target && findex!=-1){
    //             sindex=i;
    //         }
    //     }
    //     System.out.println(findex + " second " + sindex);

    // }
    static void Find_first_Last_Index_of_Target_Element(int[]a, int target){
       
        int  findex = fidnindex(a,target, true);
        int  sindex = -1;
        if(findex!=-1){
            sindex = fidnindex(a,target, false);
        }
        System.out.println(findex + " second " + sindex);
    }

   static int fidnindex(int[]a, int target, boolean findex){
        int s=0;
        int e=a.length;
        int ans = -1;
        
        while(s<=e){
            int mid = s+ (e-s)/2;
            if(a[mid]<target){
                s=mid+1;
            }
            else if (a[mid]> target){
                e=mid-1;
            }
            else{
                ans = mid;
                if(findex){
                    e = mid-1;
                }else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}
