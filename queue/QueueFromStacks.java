package queue;

import java.util.Stack;

public class QueueFromStacks {
    private Stack<Integer> s1 = new Stack<Integer>();
    private Stack<Integer> s2 = new Stack<Integer>(); 
    public QueueFromStacks() {
        s1 = new Stack();
        s2 = new Stack();
    }
    
    public void push(int x) {
        s1.push(x);
        return;
    }
    
    public int pop() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
       int removed = s2.pop();
       while(!s2.isEmpty()){
           s1.push(s2.pop());
       }
       return removed;
    }
    
    public int peek() {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }

        int top=s2.peek();

        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        return top;
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        QueueFromStacks obj = new QueueFromStacks();
        obj.push(1);
        int param_2 = obj.pop();
        int param_3 = obj.peek();
        boolean param_4 = obj.empty();
    }
}