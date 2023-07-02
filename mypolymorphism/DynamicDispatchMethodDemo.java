package mypolimorphism;

/**
 * DynamicDispatchMethodDemo
 */
class A {
    public void show() {
        System.out.println("Inside A show");
    }
}
class B extends A {
    public void show() {
        System.out.println("Inside B show");
    }
}

public class DynamicDispatchMethodDemo {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        //Referance of A but object of B
        // A obj = new B();
        // obj.show();

        obj = new B();
        obj.show();
    }
}