package calculator;

public class AdvCalc extends Calc {
    public int multiplication(int a, int b){
        return a*b;
    }

    public int division(int a, int b){
        if (b==0) return -1; 
        return a/b;
    }
}
