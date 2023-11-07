import java.util.Scanner;

public class PrintnNumber {
    
    public static void main(String[]strings){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        sc.close();
        printNumber(n);

        // try (Scanner sc = new Scanner(System.in)) {
        //     System.out.println("Enter the number");
        //     int n = sc.nextInt();
        //     printNumber(n);
        // }

        //concept 
    }

    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.print(n+ " ");
        printNumber(n-1);
        // printNumber(n--);// this will give stack over flow error

        printNumber(--n);
        
    }
}
