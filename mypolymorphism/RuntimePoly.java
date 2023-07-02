package mypolimorphism;

class Person {
    public void showDetails() {
        System.out.println("Basic details of the person");
    }
}
class Emp extends Person {
    public void showDetails() {
        System.out.println("Basic details of the employee");
    }
}
public class RuntimePoly {
    public static void main(String[] args) {
        Person p = new Emp();
        p.showDetails();
    }
}
