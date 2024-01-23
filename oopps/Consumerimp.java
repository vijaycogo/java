package oopps;

import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;

public class Consumerimp {
    public static void main(String[] args) {
        
        List<Integer> list = Arrays.asList(3,7,4,6,9);

        // Consumer<Integer> consu = new Consumer<Integer>() {

        //     public void accept(Integer n){
        //         System.out.println(n);
        //     }
        // };
        // list.forEach(consu);



        // Consumer<Integer> consu = (Integer n) -> {
        //     System.out.println(n);
        // };

        // Consumer<Integer> consu = (Integer n) ->  System.out.println(n);

        // Consumer<Integer> consu = n ->  System.out.println(n);
        // list.forEach(consu);

        
        list.forEach(n ->  System.out.println(n));
    }
}
