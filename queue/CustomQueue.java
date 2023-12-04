package queue;

import java.util.Arrays;

public class CustomQueue {
    private int[] data;
    public static final int DEFAULT_SIZE = 10;
    int end=0;
    public  CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public boolean insertItem(int item){
        if(isFull()){
            System.out.print("Queue is Full");
        }
        data[end++]=item;
        return true;
    }

    public int removedItem(){
        if (isEmpty()){
            System.out.print("Queue is Empty");
            return -1;
        }
        int first_element = data[0];
        for(int i=0;i<end;i++){
            data[i]=data[i+1];
        }
        return first_element;
    }


    // public boolean insertItem(int item) throws StackExeption{
    //     if(isFull()){
    //         throw new StackExeption("Queue is Full");
    //     }
    //     data[end++]=item;
    //     return true;
    // }

    // public int removedItem() throws StackExeption{
    //     if (isEmpty()){
    //         throw new StackExeption("Queue is Empty");
    //     }
    //     int first_element = data[0];
    //     for(int i=0;i<end;i++){
    //         data[i]=data[i+1];
    //     }
    //     return first_element;
    // }

    public void display(){
        System.out.println(Arrays.toString(data));
    }

    private boolean isEmpty() {
        return end==0;
    }
    private boolean isFull() {
        return end==data.length-1;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.insertItem(1);
        queue.insertItem(2);
        queue.insertItem(3);
        queue.insertItem(4);
        queue.display();
        queue.removedItem();
        queue.display();
    }
}
