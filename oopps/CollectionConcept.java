package oopps;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;;

// import hasset.HasSet;

public class CollectionConcept {
    public static void main(String[] args) {
        // Collection nums = new ArrayList<>();
        // nums.add(4);
        // nums.add(5);
        // nums.add(6);
        // nums.add(7);
        // //////////////////////////////// 
        // // if we not specify type of data then it will give error at run time
        // nums.add("9");


        // System.out.println(nums);

////////////////////////////////////////////////////////////////////
        Collection<Integer> nums2 = new ArrayList<Integer>();
        nums2.add(4);
        nums2.add(5);
        nums2.add(6);
        nums2.add(7);

        //////////////////////////////// 
        // if we  specify type of data then it will give error at compile time
        //  itself so its better to use type
        // nums2.add("9");

        System.out.println(nums2);

        for(int n : nums2){
            System.out.println(n);
        }

        List<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(5);

        System.out.println(list);
        System.out.println(list.get(0));


        Set<Integer> set  = new HashSet<Integer>();

        set.add(5);
        set.add(6);
        set.add(7);
        set.add(8);
        set.add(5);

        System.out.println(set);

    }
}
