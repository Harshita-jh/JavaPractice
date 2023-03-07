package threads;

//Creating thread using Runnable interface
public class MyThread implements Runnable {
	
	public void run() {
		//Task for thread...
		for(int i=0;i<=10;i++) {
			System.out.println("Value of i is :" +i);
			
			//to wait our thread for 1 second
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}

	public static void main(String[] args) {
		//Creating object for MyThread class
		MyThread t1 = new MyThread();
		
		//Creating inbuild  Thread class object to call start() method or start a thread
		Thread t = new Thread(t1);
		 
	}

}
