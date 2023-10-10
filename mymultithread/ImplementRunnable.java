public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("This is running in a new thread.");
    }
    
}

public class ImplementRunnable {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}