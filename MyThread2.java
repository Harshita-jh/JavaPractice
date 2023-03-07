package threads;

//Creaating thread using Thread Class
public class MyThread2 extends Thread{

	public void run() {
		for(int i=100;i>=1;i++) {
			System.out.println("Another thread" +i);
				
		}
	}
	public static void main(String[] args) {
		//object of MyThread2
		MyThread2 t2 = new MyThread2();
		t2.start();

	}

}
