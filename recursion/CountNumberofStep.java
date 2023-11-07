import java.util.Scanner;


public class CountNumberofStep {
    public static void main(String[]strings){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");

        int  n = sc.nextInt();
        sc.close();
        System.out.println( number_of_step_to_reduce_zero(n,0));
        // number_of_step_to_reduce_zero(n,0);
    }

    public static int number_of_step_to_reduce_zero(int n,int cnt){
        if(n==0){
            return cnt;
        }
        if(n%2==0){
            return number_of_step_to_reduce_zero(n/2, ++cnt);
        }
        else{
            return number_of_step_to_reduce_zero(n-1, ++cnt);
        }
    }
}
