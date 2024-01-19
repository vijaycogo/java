package oopps;

// class A{
//     public void show(){
//         for(int i=0;i<100;i++){
//             System.out.println("Hi");
//         }
//     }
// }

// class B{
//     public void show(){
//         for(int i=0;i<100;i++){
//             System.out.println("Hello ");
//         }
//     }
// }

//////////////////////////////////////////////////////////////////////////////////////
// multi thread

// class A implements Runnable {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Hi");
//             try{
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }

// class B implements Runnable {
//     public void run() {
//         for (int i = 0; i < 100; i++) {
//             System.out.println("Hello ");

//             try {
//                 Thread.sleep(10);
//             } catch (InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

public class MultiThreadexample {
    public static void main(String[] args) {
        // Runnable obj1 = new A();
        // Runnable obj2 = new B();

        // Start both threads
        // obj1.start();

        ///////////////////////////////////////////////////////////////////////////////////////////////////
        // using lambda expression

        // Runnable implementation using lambda expression
        Runnable obj1 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hi");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello ");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Creating threads and assigning the runnable tasks
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // Starting both threads
        t1.start();
        t2.start();
    }
}

