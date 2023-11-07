package pattern;
import java.util.Scanner;

public class Pattern {
    public static void main(String [] args){
        System.out.println("enter row and colmn max");
        Scanner i = new Scanner(System.in);
        Scanner j = new Scanner(System.in);
        int row = i.nextInt();
        int column = j.nextInt();
        for (int k= 1;k<=row; k++){
            for(int l=1;l<=column; l++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for(int k = 1; k<=row; k++){
            for(int l= 1; l<=column; l++){
                if(k==1|| l==1|| k==row || l ==column){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


        System.out.println("half pyramid");
        for(int k =1; k<=row; k++){
            for(int l=1;l<=column; l++){
                if(l<=k){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println("print half pyramid with only one input");
        Scanner x= new Scanner(System.in);
        int n= x.nextInt();
        for(int d=1;d<=n;d++){
            for(int l=1;l<d;l++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Print butter fly patter 
        // First upper part
        System.out.println("Enter number for butter fly patter");
        Scanner sco = new Scanner(System.in);
        int sco1 = sco.nextInt();

        for(int k=1; k<=sco1; k++) {
            for(int l=1; l<=k; l++) {
                System.out.print("*");
            }
 
            // FOR PRINTING SPACE  
            int spaces = 2 * (sco1-k);
            for(int l=1; l<=spaces; l++) {
                System.out.print(" ");
            }
 
            //      PRINT RIGHT PART STAR
            for(int l=1; l<=k; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int k=sco1; k>=1; k--){
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            // print space
            int spaces = 2*(sco1-k);
            for(int l=1;l<=spaces;l++){
                System.out.print(" ");
            }

            // for right part
            for(int l=1;l<=k;l++){
                System.out.print("*");
            }
            System.out.println();
        }
 
    }
    
    
}
