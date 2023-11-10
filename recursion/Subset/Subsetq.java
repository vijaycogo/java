package Subset;

import java.util.ArrayList;
import java.util.List;

public class Subsetq {
    
    // time coplexity o(n*2^n)
    public static void main(String[] args) {
        int[] a={1,2,3};

        List<List<Integer>> ans = Subsetfunction(a);
        System.out.println(ans);
        for(List<Integer>list : ans){
            System.out.println(list);
        }
    }


    public static List<List<Integer>> Subsetfunction(int[] num){
     
        List<List<Integer>>outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int element: num){
            int n = outer.size();
            for(int i=0;i<n;i++){
                List<Integer>internal = new ArrayList<>(outer.get(i));
                internal.add(element);
                outer.add(internal);
            }
        }
        return outer;
    }
}
