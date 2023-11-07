package stack;
import java.util.Stack;

public class ReverseStack {

    // function for print stack
    public static void printStack(Stack<Integer>s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    
    // function to push at buttom of any stack 
    public static void pushAtButtom(int data, Stack<Integer>s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtButtom(data, s);
        s.push(top);// it will push at top of stack
    }

    public static void reversestack(Stack<Integer>s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reversestack(s);
        pushAtButtom(top, s);
    }

    public static void main(String []args){
        Stack<Integer> stack= new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
    
        //  using another stack we can reverse the original stack
        // Stack<Integer> stack2 = new Stack<>();
    
        // while(!stack.isEmpty()){
        //     stack2.push(stack.pop());
        // }

        // System.out.println(" before reverse");
        // printStack(stack);

        reversestack(stack);

        System.out.println(" after reverse");
        printStack(stack);

    }
}
