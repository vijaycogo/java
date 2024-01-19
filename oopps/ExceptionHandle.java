package oopps;

import java.util.Scanner;

public class ExceptionHandle {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int first = sc.nextInt();
        System.out.println("enter second number");
        int second = sc.nextInt();

        try
        {
            int j = first/second;
            System.out.println("result is " + j);
        }
        catch(Exception e){
            System.out.println("Somethong went wrong");
        }

        System.out.println("Bye Vijay ....");


        sc.close();

    }
    
}
