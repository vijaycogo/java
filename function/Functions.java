package function;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactoryException;
import javax.swing.plaf.synth.SynthStyle;

public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        return;
    }
    public static int printFactorial(int n){
        if (n<0){
            System.out.println("number is invalid");
        }
        int factorial = 1;
        for(int i =n; i>1; i--){
            factorial = factorial*i;
        }
        return factorial;
    }


    public static void isPrimeNumber(int n){
        if (n<0){
            System.out.print("number is invalid");
        }
        for(int i=1;i<n;i++){
            if(n%i ==0){
                System.out.print("number is prime not prime ");
                return;
            }
        }
    }

    public static void findSum(int n1, int n2){
        System.out.print(n1+n2);
        return;
    }

    public static void findAverage(int n1, int n2, int n3){
        int average = (n1+n2+n3)/3;
        System.out.print(average);
    }

    public static void printOdd(int n){
        int i =1;
        while(i<=n){
            System.out.println(i);
            i+=2;
        }
    }


    public static void greaterNumber(int n1, int n2){
        int x = n1 > n2 ? n1: n2;
        System.out.print(x);
    }


    public static void intfiniteLoop(){
        do {
            System.out.print("vijay");
        }
        while(true);
    }


    public static void userRequirement(){
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        char choice;
        do {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.print("Do you want to continue? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of zeros: " + zeroCount);

        scanner.close();
    }

    public static void fibonucciNumber(int n){
        int i = 0;
        int j = 1;
        int fib;
        int count =0;        
        while(count < n){
            System.out.print(" "+ i);
            fib = i + j;
            i = j;
            j = fib;
            count++;
        }
    }

    public static void Gcd(int a, int b){
        if (a<b){
            int temp = a;
            a = b;
            b=temp;
        }

        while(b!=0){
            int quotation = a%b;
            a = b;
            b= quotation;
        }
        System.out.print(a);
    }

    public static void main(String args[]){
        // System.out.println("enter name");
        // Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // printMyName(name);
        // System.out.println("enter number to calulate factorial");

        // Scanner sc1 = new Scanner(System.in);
        // int n  = sc1.nextInt();
        // int factorial = printFactorial(n);
        // System.out.println(factorial);

        // check number is prime or not
        // System.out.println("enter number"); 
        // Scanner sc2 = new Scanner(System.in);
        // int prime = sc2.nextInt();
        // isPrimeNumber(prime);

        // System.out.println("enter two number to find sum");
        Scanner sc3 = new Scanner(System.in);
        Scanner sc4 = new Scanner(System.in);
        // Scanner sc5 = new Scanner(System.in);


        int n1 = sc3.nextInt();
        int n2 = sc4.nextInt();
        // int n3 = sc5.nextInt();
        // findSum(n1,n2);
        // findAverage(n1,n2,n3);
        // printOdd(n3);
        // greaterNumber(n1,n2);

        // intfiniteLoop();


        // userRequirement();


        // for printing fibonnaci number
        // System.out.println("enter number: ");
        // Scanner scanner = new Scanner(System.in);
        // int n = scanner.nextInt();
        // fibonucciNumber(n);

        Gcd(n1, n2);

    }
    
}

 
