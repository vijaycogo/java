package stack;

import java.util.Stack;

public class stackCollection {

    public static void pushAtButtom(int data, Stack<Integer> stack){

        if(stack.isEmpty()){
            stack.push(data);
            return;
        }
        //  removed top element recursive and again call recursion
        int top = stack.pop();
        pushAtButtom(data, stack);
        stack.push(top);
    }
    public static void main(String []args){
        Stack<Integer> stackname = new Stack<>();
        Stack <Integer> stack2 = new Stack<>();
        stackname.push(1);
        stackname.push(2);
        stackname.push(3);
        stackname.push(4);
    
        System.out.println(" original stack");
        while(!stackname.isEmpty()){
            System.out.println(stackname.peek());
            stack2.add(stackname.pop());
        
        }
        
        // add elemet in the buttom of stack
        stackname.push(0);
        while(!stack2.isEmpty()){
            stackname.push(stack2.pop());
        }

        System.out.println(" after adding elemet in buttom of original stack");
        while(!stackname.isEmpty()){
            System.out.println(stackname.peek());
            stackname.pop();
        }

        // ?//////////////////////////////////////// ?//////////////////////////////////////// ?//////////////////////////////////////
        // ?//////////////////////////////////////// ?//////////////////////////////////////// ?//////////////////////////////////////

        Stack<Integer> newstack = new Stack<>();
        newstack.push(6);
        newstack.push(7);
        newstack.push(9);
        newstack.push(10);
        // 4
        // 3
        // 2
        // 1
        System.out.println("size before adding element: " + newstack.size());
        stackCollection.pushAtButtom(5,newstack);
        System.out.println("size after adding element: " + newstack.size());

        System.out.println("third stack using recursion to add at the buttom");

        while(!newstack.isEmpty()){
            System.out.println(newstack.pop());
        }
    }
}
