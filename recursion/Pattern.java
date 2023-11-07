public class Pattern {
    public static void main(String[]strings){
        int n=4;
        printpattern(n);
        System.out.println("orher way");
        usingRecursionPrintPattern(n,n);
        // other way
        System.out.println("using recursion way");
        usingRecursionPrintPattern2(n,0);
    }

    public static void printpattern(int n){
        while(n>0){
            int j=n;
            while(j>0){
                System.out.print("*"+ " ");
                j--;
            }
            System.out.println();
            n--;
        }
    }

    public static void usingRecursionPrintPattern(int row, int column){
        if(row==0){
            return;
        }
        while(column>0){
            System.out.print("*"+ " ");
            column--;
        }
        System.out.println();
        usingRecursionPrintPattern(row-1, row-1);
    }


    public static void usingRecursionPrintPattern2(int row, int column){
        if(row==0){
            return;
        }
        if(row>column){
            // System.out.print("*" + " ");
            usingRecursionPrintPattern2(row, ++column);
            System.out.print("*" + " ");
        }
        else{
            // System.out.println();
            usingRecursionPrintPattern2(--row, 0);
            System.out.println();
        }
    }
}
