package condition;
import java.util.*;
// import java.util.Scanner;


public class Condition{
    public static void main(String []Strings){

        System.out.println("Enter First  number");
        Scanner  sc1 = new Scanner(System.in);
        int x  = sc1.nextInt();

        System.out.println("Enter Second  number");
        Scanner  sc2 = new Scanner(System.in);
        int y  = sc2.nextInt();
    
        if (x == y){
            System.out.println("number  is equal");
        }
        else if(x> y){
            System.out.println(" number  is greater");
        }
        else{
            System.out.println(" number  is less");
        }

    
        // int n = 3;
        System.out.println("enter number for checking the weekdays");
        Scanner input_number = new Scanner(System.in);
        String s1 = "vijay";
        String s2 = "vijay";

        if(s1.equals(s2)){
            System.out.println("Both string are equal");
        }
        
        if(s1 == s2){
            System.out.println("Both string are equal");
        }
        // System.out.println("girj ");
        // String st = input_number.next();
        // switch(st){
        //     case "mango":
        //     System.out.println("mango is king");
        // }

        int n = input_number.nextInt();
        switch(n) {
        case 1 :
            System.out.println("Monday");
            break;
        case 2 :
            System.out.println("Tuesday");
            break;
        case 3 :
            System.out.println("Wednesday");
            break;
        case 4 :
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6 :
            System.out.println("Saturday");
            break;
        default :
            System.out.println("Sunday");
        }
    }
}
