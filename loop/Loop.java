package loop;
import java.util.Scanner;


public class Loop {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += i;
        }
        System.out.println("sum of n nanural number");
        System.out.println(sum);



        System.out.println("enter number for table");
        Scanner in = new Scanner(System.in);
        int mn = in.nextInt();
        System.out.println("table of given  number");
        for(int i=1;i<=10;i++){
            int out = mn*i;
            System.out.println(out);
        }



        System.out.println("for lopp");
        for(int i =0; i<n; i++){
            System.out.println(i);
        }




        System.out.println("while loop");
        int x = 6;
        while(x<n){
            System.out.println(x);
            x++;
        }
        System.out.println("do while loop");
        int y =15;
        do{
            System.out.println(y);
            y++;
        }
        while(y<n);
    }
}
