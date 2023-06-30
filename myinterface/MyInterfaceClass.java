package myinterface;

interface i1{

}
interface i2{

}
interface i3 extends i1, i2{

}

class c1 implements i1, i2{
    
}
interface MyInterface {
    void method();
    //after java8
    static void method2(){
        System.out.println("Inside method2...");
    }
    default void method3(){
        System.out.println("Inside method3...");
    }
}

class MyClass implements MyInterface {

    @Override
    public void method() {
        
    }

}

public class MyInterfaceClass {
    public static void main(String[] args) {
        MyInterface mi = new MyClass();
        mi.method();
        MyInterface.method2();
        mi.method3();
    }
}
