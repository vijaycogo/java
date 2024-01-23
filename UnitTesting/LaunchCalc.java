package UnitTesting;


class Calc {
    public int  Product(int a, int b){
        return a*b;
    }
}

public class LaunchCalc {
    public static void main(String[] args) {
        Calc cal = new Calc();
        int result = cal.Product(4,6);
        if(result==24){
            System.out.println("test is passed");
        }
        else{
            System.out.println("test is failed");
        }


        int nums[] = {3,5,6,7,11,19};
        int target = 19;
        int ans;
        ans = linearSearch(nums, target);
        ans = BinearySearch(nums, target, 0, nums.length);

        if(ans==-1){
            System.out.println("target element is not found");
        }
        else{
            System.out.println("target element is found at index : " + ans);
        }
    }

    // public static int BinearySearch(int[] nums, int target, int s, int e) {
    //     int step =0;
    //     while (s<=e){
    //         step ++;
    //         int mid = (s+e)/ 2;
    //         if(nums[mid] == target){
    //             System.out.println("number of step is : " + step);
    //             return mid;
    //         }else if(nums[mid]> target){
    //             e = mid-1;
    //         }
    //         else{
    //             s = mid +1;
    //         }
    //     }
    //     return -1;
    // }


    public static int BinearySearch(int[] nums, int target, int s, int e) {
        int step =0;
        while (s<=e){
            step ++;
            int mid = (s+e)/ 2;
            if(nums[mid] == target){
                System.out.println("number of step is : " + step);
                return mid;
            }else if(nums[mid]> target){
                return BinearySearch(nums, target, s, mid -1);
            }
            else{
                return BinearySearch(nums, target, mid+1, e);
            }
        }
        return -1;
    }

    public static int linearSearch(int[] nums, int target) {
        int step=0;
        for(int i=0;i<nums.length; i++){
            step++;
            if(nums[i]==target){
                System.out.println("number of step is : " + step);
                return i;
            }
        }
        return -1;
    }
    
}
// javac -d . Consumerimp.java
// java oopps.ComparatorImpl