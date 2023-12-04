package stack;

public class StackMain {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack();
        stack.insertItem(1);
        stack.insertItem(2);
        stack.insertItem(3);
        stack.insertItem(4);
        stack.peek();
        stack.removedItem();
    }
}
