package oopps;

import java.util.Scanner;

@FunctionalInterface
interface A{

    void show (int i);
}
// lambda expression work only with functional interface
public class LambdaExpression {
    public static void main(String[] args) {
    
        // A obj = new A() {
        //     public void show(int j){
        //         System.out.println("in show method " + j);
        //     }
        // };
        // obj.show(8);

        ////////////////////////////////////////////////////////////////////////////////////////////////
        
        // A obj = (int j) -> System.out.println("in show method " + j);
        // obj.show(8);
        
        ////////////////////////////////////////////////////////////////////////////////////////////////

        A obj = (j) -> System.out.println("in show method " + j);
        obj.show(8);


        ////////////////////////////////////////////////////////////////////////////////////////////////
        A obj1 = j -> System.out.println("in show method " + j);
        obj1.show(9);

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();
        System.out.println(num);

        sc.close();



    }
}
