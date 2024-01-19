package oopps;


// javac -d . AnnonymsInnercla.java
// java oopps.AnnonymsInnercla

class Parent{
    public void show(){
        System.out.println("in parent show");
    }
}
public class AnnonymsInnercla {
    public static void main(String[] args) {

        Parent obj = new Parent(){
            public void show(){
                System.out.println("in inner class");
            }
        };

        obj.show();
    }    
}
