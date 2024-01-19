package oopps;

class VijayException extends Exception{
    public VijayException(String message){
        super(message);
    }
}


public class ThrowException {

    public static void main(String[] args) {
        int i=29;
        int j =0;
        try{

            j = 20/i;

            // if (j==0){
            //     throw new ArithmeticException("default value is 1 ");
            // }

            if (j==0){
                throw new VijayException("can not except j is 0 ");
            }

        }
        catch(VijayException e ){
            j = 20/1;
            System.out.println("custom Exception " + e);
        }
        // catch(ArithmeticException e){
        //     j = 20/1;
        //     System.out.println("arthematic operator is wrong" + e);
        // }
        catch(Exception e){
            System.out.println("Some thing went wrong");
        }

        System.out.println(j);
    }
    
}
