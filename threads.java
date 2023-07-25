package threads;

class ABC extends Thread{
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("shashi");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class BCD extends Thread{
	public void run() {
		for(int i=1;i<100;i++) {
			System.out.println("kiran");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class basicMultiThreading {

	public static void main(String[] args) {
		ABC A=new ABC();
		BCD B=new BCD();
		
//		A.setPriority(10);
//		B.setPriority(3);
		
		A.setPriority(Thread.MAX_PRIORITY-1);
		B.setPriority(Thread.MIN_PRIORITY+3);
		
		//MAX_PRIORITY=10,MIN_PRIORITY=1,NORM_PRIORITY=5
		
		System.out.println(A.getPriority());
		System.out.println(B.getPriority());
		
		A.start();
		B.start();
	}
}

