package SubSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class SubSequence {
    
    public static void main(String[] args) {
        String s= "abc";
        // noOfSubSequence(" ", s);
        ArrayList<String>result =  noOfSubSequenceReturn(" ", s);

        System.out.println(result);

    }
    public static void noOfSubSequence(String ans ,String s ){
        if(s.isEmpty()){
            System.out.println(ans);
            return;
        }

        char ch = s.charAt(0);
        noOfSubSequence(ans + ch , s.substring(1));
        noOfSubSequence(ans, s.substring(1));
    }


    public static ArrayList<String> noOfSubSequenceReturn(String ans ,String s ){
        if(s.isEmpty()){
            ArrayList<String>list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch =s.charAt(0);
        ArrayList<String>left = noOfSubSequenceReturn(ans+ ch, s.substring(1));
        ArrayList<String>right= noOfSubSequenceReturn(ans, s.substring(1));
        left.addAll(right);// it will add ans from both left and right
        return left;// or right
    }
}
