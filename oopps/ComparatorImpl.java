package oopps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Students {
    int age;
    String name;


    public Students(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String toString() {
        return "Students [age=" + age + ", name=" + name + "]";
    }


    
}

public class ComparatorImpl {
    public static void main(String[] args) {


        // Comparator<Students> com = new Comparator<Students>() {
            
        //     public int compare(Students i, Students j){
        //         if(i.age > j.age){
        //             return 1;
        //         }
        //         else{
        //             return -1;
        //         }
        //     }
        // }; 

        // since Comparator is functional interface so we can use lambda function
        Comparator<Students> com = (i,j)-> i.age > j.age ? 1 : -1;


        List<Students> list1 = new ArrayList<>();
        list1.add(new Students(4, "vijay"));
        list1.add(new Students(5, "ay"));
        list1.add(new Students(9, "Sanjay"));
        list1.add(new Students(2, "Ajay"));

        Collections.sort(list1, com);

        for(Students a : list1 ){
            System.out.println(a.age +  " : " + a.name);
        }
    }
    
}
