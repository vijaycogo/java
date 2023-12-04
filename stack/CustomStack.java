package stack;

import java.util.Arrays;

public class CustomStack {
    protected int[] data;
    private static final int  DEFAULT_SIZE=10;
    int index =-1;
    public CustomStack(){
        this(DEFAULT_SIZE);//this will call the next constructor directly
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }
    
    public boolean insertItem(int element){

        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        index++;
        data[index] = element;
        return true;
    }

    public int removedItem(){
        if (isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return data[index--];
    }


    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        return data[index];
    }
    private boolean isFull(){
        return index == data.length -1;
    }

    private boolean isEmpty(){
        return index == -1;
    }

    private void print() {
        System.out.println(Arrays.toString(data));
    }



    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.insertItem(1);
        stack.insertItem(2);
        stack.insertItem(3);
        stack.insertItem(4);
        stack.peek();
        // stack.removedItem();
        stack.print();
        System.out.println(stack.removedItem());
        stack.print();
    }
}
