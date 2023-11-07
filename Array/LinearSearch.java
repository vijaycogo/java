package Array;

import java.util.ArrayList;
import java.util.Scanner;

import javax.lang.model.util.ElementFilter;
import javax.sound.midi.SysexMessage;

public class LinearSearch {
    public static void main(String []strings){

        // SearchTargetInteger();
        // SearchTargetString();
        int[] a = {2,1,4,9995,678};
        // FindMinimum(a);

        int res = findevennumberofdigit(a);
        System.out.println(res);


    }
    
    static void SearchTargetInteger() {
        Scanner in = new Scanner(System.in);
        int[] a = {2,1,4,5,6};
        int target = in.nextInt();

        for(int i=0;i<a.length; i++){
            if(a[i]==target){
                System.out.println(i);
            }
        }
    }

    static void FindMinimum(int[] a){
        int minimum = a[0];
        for(int i = 1;i<a.length;i++){
            if(a[i]< minimum){
                minimum = a[i];
            }
        }
        System.out.println(minimum);
    }

    static void SearchTargetString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String sc1 = sc.nextLine();
        // System.out.println("Enter target character");
        char target = 'j';
        for(int i=0;i<sc1.length(); i++){
            if(target == sc1.charAt(i)){
                System.out.println(target + " char is at index " + i);
            }
        }
    }

    static int findevennumberofdigit(int[] a){
        int ans = 0;
        for(int element: a){
            ans +=counteventdigit(element);
        }
        return ans;

    }

    static int counteventdigit(int element){
        int count =0;
        while(element > 0){
            element = element/10;
            count++;
        }
        if(count%2==0){
            return 1;
        }
        else{
            return 0;
        }
    }
}
