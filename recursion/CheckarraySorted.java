

public class CheckarraySorted {
    public static void main(String[]strings){
        int[] a = {1,2,3,4,5};
        int[] a1 = {1,12,43,4,5};
        boolean ans, ans1;
        ans = checksorted(0,a);
        ans1 = checksorted(0,a1);
        System.out.println(ans);
        System.out.println(ans1);
        // number_of_step_to_reduce_zero(n,0);
    }
    public static boolean checksorted(int i,int[]a){
        if(i==a.length-1){
            return true;
        }
        if(a[i]<a[i+1]){
            return checksorted(++i, a);
        }
        return false;
    }

}
