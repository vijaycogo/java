import java.util.ArrayList;
import java.util.Arrays;


//User function Template for Java

class Compute {

    public static void main(String[] args) {
        long[] arr =  {4, 7, 3, 6, 7};
        long n = arr.length;
        long[] ans = getTriangle(arr,n);
        System.out.print(Arrays.toString(ans));
        
    }

    public static long[] getTriangle(long arr[], long n) {
        ArrayList<Long> a = new ArrayList<>();

        for (long num : arr) {
            a.add(num);
        }

        ArrayList<Long> ans = helper(a, n);
        long[] res = new long[ans.size()];
        
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        return res;
    }

    public static  ArrayList<Long> helper(ArrayList<Long> a, long n) {
        ArrayList<Long> newlist = new ArrayList<Long>();
        
        if (n == 0) {
            return a;
        }

        for (int i = 0; i < n - 1; i++) {
            newlist.add(a.get(i) + a.get(i + 1));
        }

        newlist.addAll(a);
        return helper(newlist, n - 1);
    }
}