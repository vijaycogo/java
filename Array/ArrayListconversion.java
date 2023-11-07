package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListconversion {
    public static void main(String[]strings){

        int[] nums = {1,2,3,4,0}; 
        int[] index = {0,1,2,3,0}; 
        int[] ans = createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        int n=nums.length;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            int in = index[i];
            int val = nums[i];
            ans.add(in, val);
        }
        // convert arrayList to array
        // int[] arr = ans.stream().mapToInt(i -> i).toArray();
        // int[] res =ans.stream().mapToInt(Integer::intValue).toArray();
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = ans.get(i);
        }
        return result;
        
    }
}
