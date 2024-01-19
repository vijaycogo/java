package oopps;

class Parentclass {

    int age;

    public void show() {
        System.out.println("in show method");
    }

    // Inner class within Parentclass
    class Inner {
        public void innershow() {
            System.out.println("in inner show method");
        }
    }
}

public class InnerClass {

    public static void main(String[] args) {
        // Creating an object of Parentclass
        Parentclass obj1 = new Parentclass();

        // Calling the show method of Parentclass
        obj1.show();

        // Creating an object of the Inner class using the Parentclass instance
        Parentclass.Inner innerObj = obj1.new Inner();

        // Calling the innershow method of the Inner class
        innerObj.innershow();
    }
}
