package mypolimorphism;

class Student  {
    public void read() {
        System.out.println("Reading XZY book");
    }
    public void read(String bookName) {
        System.out.println("Reading " + bookName + "book");
    }
}
public class CompileTimeDemo {
    public static void main(String[] args) {
        System.out.println("This is just for testing");
        Student student = new Student();
        student.read("Think Python");
    }
}
