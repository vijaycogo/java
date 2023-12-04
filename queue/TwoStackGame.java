package queue;

import java.util.Stack;

public class TwoStackGame {
   public static void main(String[] args) {
    Stack<Integer>s1=new Stack<>();
    Stack<Integer>s2=new Stack<>();
    int maxsum = 10;
    s1.push(4);
    s1.push(4);
    s1.push(2);
    s1.push(4);
    s1.push(6);
    s1.push(1);
    s2.push(2);
    s2.push(1);
    s2.push(8);
    s2.push(5);
    // findMAxcountInteger(s1,s2,maxsum);
    System.out.println(findMAxcountInteger(s1,s2,maxsum));

   }

    private static int findMAxcountInteger(Stack<Integer> s1, Stack<Integer> s2, int maxsum) {
        
        int count =0;
        while(!s1.isEmpty()&& !s2.isEmpty()){
            if(s1.peek() < s2.peek() && s1.peek() < maxsum){
                count++;
                maxsum = maxsum - s1.pop();
            }else if(s1.peek() > s2.peek() && s2.peek() < maxsum){
                maxsum = maxsum - s2.peek();
                count++;
            }
        }
        while(!s1.isEmpty()){
            if(s1.peek() < maxsum){
                count++;
                maxsum = maxsum - s1.pop();
            }
        }
        while(!s2.isEmpty()){
            if(s2.peek() < maxsum){
                count++;
                maxsum = maxsum - s2.pop();
            }
        }
        return count;
    } 
}
