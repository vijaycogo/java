package Phonepad;

import java.util.ArrayList;

public class Phonepad {
    public static void main(String[] args) {
        printpad(" ", "12");

        System.out.print(retrunpad(" ", "12"));
    }

    public static void printpad(String ans, String original){
        if(original.isEmpty()){
            System.out.println(ans);
            return;
        }
        int digit = original.charAt(0) - '0'; 
        for(int i=(digit - 1) * 3; i < digit * 3; i++){
            char current = (char)('a' + i);
            printpad(ans + current, original.substring(1));
        }
    }

    public static ArrayList<String> retrunpad(String ans, String original){
        if(original.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = original.charAt(0) - '0';

        ArrayList<String> list2 = new ArrayList<>();
        for(int i= (digit - 1) * 3; i< digit * 3 ; i++){
            char current = (char)('a'+ i);
            list2.addAll(retrunpad(ans + current, original.substring(1)));
        }
        return list2;
    }
}
