package oopps;

// class Counter{
//     int count =0;
//     public void counters(){
//         count++;
//     }
// }

class Counter{
    int count;
    public synchronized void increaments(){
        count++;
    }
}
public class Mutation {
    
    public static void main(String[] args) {
        Counter c = new Counter();


        Runnable obj1 = ()->{
            for(int i=0;i<1000;i++){
                c.increaments();
            }
        };

        Runnable obj2 = ()->{
            for(int i=0;i<1000;i++){
                c.increaments();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
        System.out.println(c.count);
    }
}
