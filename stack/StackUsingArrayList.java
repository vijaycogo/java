package stack;

import java.util.ArrayList;

// import javax.lang.model.element.Element;

public class StackUsingArrayList {

    static class Stack{
        static ArrayList<Integer> arraylist = new ArrayList<>();

        static void push(int data){
            arraylist.add(data);
        }

        public boolean isEmpty() {
            return arraylist.size() == 0;
        }


        static int popElemet(){
            if(arraylist.isEmpty()){
                return -1;
            }

            int top_element = arraylist.remove(arraylist.size()-1);
            return top_element;
        }

        static int peekElemet(){
            if(arraylist.isEmpty()){
                return -1;
            }
            int top_element = arraylist.get(arraylist.size()-1);
            return top_element;
        }
    }

    public static void main(String []args){
        Stack stackclass = new Stack();
        Stack.push(1);
        stackclass.push(2);
        stackclass.push(3);
        stackclass.push(4);
        

        while(!stackclass.isEmpty()){
            System.out.println(stackclass.peekElemet());
            stackclass.popElemet();
        }

    }
    
}
