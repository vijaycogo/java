public class Fibonucci {

    public static void main(String[]strings){
        int fib = Fibn(4);
        System.out.println(fib);
    }

    static int Fibn(int n){
        if (n<2){
            return n;
        }
        return Fibn(n-2) + Fibn(n-1);
    }
    
}
