import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int ans  = factorial(n);
        System.out.println(ans);
        sc.close();// to close the scanner
    }
    public static int factorial(int n){
        if(n<2){
            return 1;
        }
        return n*factorial(n-1);
    }
}