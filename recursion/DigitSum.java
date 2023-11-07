import java.util.Scanner;

public class DigitSum {
    public static void main(String[]strings){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        System.out.println(digitSum(n));
        // other method
        System.out.println(sumOfDigit(n, 0));

        System.out.println(ProductOfDigit(n));
    }

    public static int digitSum(int n){
        if(n<10){
            return n;
        }
        return n%10 + digitSum(n/10);
    }


    public static int sumOfDigit(int n, int sum){
        if(n==0){
            return sum;
        }
        int remainder = n%10;
        n =n/10;
        return sumOfDigit(n, sum + remainder);
    }

    public static int ProductOfDigit(int n){
        if(n<10){
            return n;
        }
        return n%10 * ProductOfDigit(n/10);
    }


    
}
