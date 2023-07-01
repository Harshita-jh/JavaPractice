package mymultithread;


class A implements Runnable {
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hi...");
            
            //sleep()-ask your thread to wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace();
        }
        }
    }
}
class B extends Thread {
    public void run(){
        for(int i=0;i<=10;i++){
            System.out.println("Hello...");

             //sleep()-ask your thread to wait
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) { e.printStackTrace();
        }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();
        
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }    
}
