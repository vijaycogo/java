import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[]strings){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        sc.close();
        // System.out.println(reverseNumber(n, 0));
        System.out.println(reverse_number_without_extra_argument(n));

    }


    public static int reverseNumber(int n, int ans){
        if(n==0){
            return ans;
        }
        ans = ans*10 + n%10;
        return reverseNumber(n/10, ans);
        
    }


    public static int reverse_number_without_extra_argument(int n){
        if(n<10){
            return n;
        }

        int number_of_digit = (int)(Math.log10(n))+1;
        double ans = n%10 * Math.pow(10, number_of_digit-1);
        // System.out.println(ans);

        return (int) ((ans) + reverse_number_without_extra_argument(n/10));
    }
}
