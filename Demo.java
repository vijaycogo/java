// import calculator.AdvCalc;


class A{
    public void show(){
        System.out.println("in a show");
    }
}

class B extends A{

    public void show1(){
        System.out.println("in b show");
    }
}

public class Demo{
    public static void main(String[] args) {
        // AdvCalc obj = new AdvCalc();
        // int r1 = obj.add( 5,2);
        // int r2 = obj.subtract(5, 2);
        // int r3 = obj.multiplication(5, 2);
        // System.out.println(r1+ " : " + r2 + " :" + r3);

        A obj3= new B();
        obj3.show();
    }
}





// class Student{
//     int roll;
//     String name;
//     int marks;
// }

// public class Demo{
//     public static void main(String[] args) {
//         Student s1 = new Student();
//         s1.roll = 1;    
//         s1.name = "vijay";
//         s1.marks = 69;

//         Student s2 = new Student();
//         s2.roll = 2;    
//         s2.name = "ajay";
//         s2.marks = 90;

//         Student s3 = new Student();
//         s3.roll = 3;    
//         s3.name = "sajay";
//         s3.marks = 99;

//         Student []arr = new Student[3];

//         arr[0]=s1;
//         arr[1]=s2;
//         arr[2]=s3;

//         for(Student s :arr){
//             System.out.println(s.roll + s.name + s.marks);
//         }

//         String name = "Vijay";
//         name = "ajay";
//         System.out.println(name);

//         StringBuffer s4  = new StringBuffer();
//         s4.append("gfhfgh");
//         System.out.println(s4);

//         StringBuilder sb=new StringBuilder("rsttgh");
//         System.out.println(sb.length());
//         System.out.println(sb.capacity());
//     }


// }

// // class Computer {
// //     int instancevariable = 8;

// //     public Integer instancecheck(){
// //         return instancevariable;
// //     }

// //     // Instance variable are stored in heap memory whicle local variable in stack
// //     //////////////////////////////////////////////////////////////////////////////////////////////////////
// //     public void playList() {
// //         System.out.println("playing music ...");
// //     }

// //     public String getPen(int num) {
// //         return "number of pen is " + num;
// //     }

// //     public Integer getMoney(int val){
// //         return val;
// //     }
// // }

// // public class Demo {
// //     public static void main(String a[]) {
// //         Computer obj = new Computer();
// //         String result = obj.getPen(2);
// //         System.out.println(result);
// //         obj.playList();

// //         Integer val = obj.getMoney(5);
// //         System.out.println(val);
// //     ///////////////////////////////////////////////////////////////////////////////////////////////////////
// //         Computer obj2 = new Computer();
// //         System.out.println(obj.instancevariable);
// //         System.out.println(obj2.instancevariable);
        
// //         System.out.println("After reasign");
        
// //         obj2.instancevariable = 9;
// //         System.out.println(obj.instancevariable);
// //         System.out.println(obj2.instancevariable);

// //         int []c = {3,4,5};
// //         int []arr = new int[9];

        
// //     }
// // }